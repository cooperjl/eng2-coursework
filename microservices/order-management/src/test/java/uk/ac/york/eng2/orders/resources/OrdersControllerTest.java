package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderItemCreateDTO;
import uk.ac.york.eng2.orders.product_management.api.PricingApi;
import uk.ac.york.eng2.orders.product_management.model.OrderItemPricingCreateDTO;
import uk.ac.york.eng2.orders.product_management.model.OrderItemPricingDTO;
import uk.ac.york.eng2.orders.product_management.model.OrderPricingCreateDTO;
import uk.ac.york.eng2.orders.product_management.model.OrderPricingDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@MicronautTest(transactional = false)
public class OrdersControllerTest {
    @Inject
    private OrdersClient client;
    @Inject
    private OrderRepository repository;
    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private OrderItemRepository orderItemRepository;

    @BeforeEach
    public void setup() {
        orderItemRepository.deleteAll();
        customerRepository.deleteAll();
        repository.deleteAll();
    }

    @MockBean(PricingApi.class)
    public PricingApi getPricingApi() {
        PricingApi mock = mock(PricingApi.class);
        // letting unit price be 1
        when(mock.getPrices(any(OrderPricingCreateDTO.class))).thenAnswer(i -> {
                    OrderPricingCreateDTO dto = i.getArgument(0);
                    OrderPricingDTO order = new OrderPricingDTO();
                    List<OrderItemPricingDTO> items = new ArrayList<>();
                    BigDecimal totalAmount = BigDecimal.ZERO;
                    for (OrderItemPricingCreateDTO itemDTO : dto.getOrderItems()) {
                        OrderItemPricingDTO item = new OrderItemPricingDTO();
                        item.setUnitPrice(BigDecimal.ONE);
                        item.setQuantity(itemDTO.getQuantity());
                        item.setProductId(itemDTO.getProductId());
                        items.add(item);
                        totalAmount = totalAmount.add(BigDecimal.valueOf(itemDTO.getQuantity()));
                    }
                    order.setOrderItems(items);
                    order.setTotalAmount(totalAmount);
                    order.setDateCreated(dto.getDateCreated());
                    return order;
                }
        );
        return mock;
    }

    private Long createGetId(OrderCreateDTO order) {
        HttpResponse<Object> response = client.create(order);
        return Long.valueOf(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    private long createCustomer() {
        Customer customer = new Customer();
        customer.setEmail("user@testmail.com");
        customer.setFirstName("John");
        customer.setFamilyName("Test");
        customer = customerRepository.save(customer);
        return customer.getId();
    }

    // create the DTO, with some default values for fields
    private OrderCreateDTO createDTO(long customerId) {
        OrderCreateDTO order = new OrderCreateDTO();

        Set<OrderItemCreateDTO> orderItems = new HashSet<>();
        OrderItemCreateDTO orderItem = new OrderItemCreateDTO();
        orderItem.setProductId(1L);
        orderItem.setQuantity(2);
        orderItems.add(orderItem);

        order.setAddress("23 Test Avenue");
        order.setCustomerId(customerId);
        order.setOrderItems(orderItems);

        return order;
    }

    @Test
    public void noOrders() {
        assertEquals(0, client.list().getContent().size());
    }

    @Test
    public void listItems() {
        long customerId = createCustomer();
        OrderCreateDTO dto = createDTO(customerId);
        long orderId = createGetId(dto);
        assertEquals(1, client.listItems(orderId).getContent().size());
    }

    @Test
    public void createOrder() {
        // Ensure not found response with invalid customer
        OrderCreateDTO dto = createDTO(66L);
        assertEquals(HttpStatus.NOT_FOUND, client.create(dto).getStatus());

        // Set valid customer and continue testing
        long customerId = createCustomer();
        dto.setCustomerId(customerId);

        long orderId = createGetId(dto);
        Order order = client.get(orderId);

        assertEquals(dto.getAddress(), order.getAddress());
        assertEquals(dto.getCustomerId(), client.getCustomer(orderId).getId());
        assertThat(BigDecimal.valueOf(2), Matchers.comparesEqualTo(order.getTotalAmount()));
        assertThat(BigDecimal.ONE, Matchers.comparesEqualTo(client.listItems(orderId).getContent().get(0).getUnitPrice()));
    }

    @Test
    public void getNonExistingOrder() {
        assertNull(client.get(0L));
    }

    @Test
    public void updateOrder() {
        long customerId = createCustomer();
        OrderCreateDTO orderDTO = createDTO(customerId);
        long orderId = createGetId(orderDTO);
        OrderCreateDTO updateDTO = createDTO(customerId);
        updateDTO.setAddress("1 Second Street");

        client.update(orderId, updateDTO);
        Order order = client.get(orderId);

        assertEquals(updateDTO.getAddress(), order.getAddress());
    }

    @Test
    public void deleteOrder() {
        long customerId = createCustomer();
        OrderCreateDTO dto = createDTO(customerId);
        long orderId = createGetId(dto);

        client.delete(orderId);
        assertNull(client.get(orderId));
    }

    @Test
    public void updateNonExistingOrder() {
        long customerId = createCustomer();
        OrderCreateDTO dto = createDTO(customerId);

        HttpResponse<Object> response = client.update(10L, dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteNonExistingOrder() {
        HttpResponse<Object> response = client.delete(5L);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void updatePaidAndDelivered() {
        long customerId = createCustomer();
        OrderCreateDTO dto = createDTO(customerId);
        long orderId = createGetId(dto);

        client.updateDelivered(orderId, true);
        client.updatePaid(orderId, true);
        Order order = client.get(orderId);

        assertEquals(true, order.getDelivered());
        assertEquals(true, order.getPaid());
    }

    @Test
    public void updatePaidAndDeliveredWithNonExistingOrder() {
        HttpResponse<Object> deliveredResponse = client.updateDelivered(5L, true);
        assertEquals(HttpStatus.NOT_FOUND, deliveredResponse.getStatus());

        HttpResponse<Object> paidResponse = client.updatePaid(5L, true);
        assertEquals(HttpStatus.NOT_FOUND, paidResponse.getStatus());
    }
}