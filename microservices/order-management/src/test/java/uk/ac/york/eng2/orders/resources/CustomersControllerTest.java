package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@MicronautTest(transactional = false)
public class CustomersControllerTest {
    @Inject
    private CustomersClient client;
    @Inject
    private CustomerRepository repository;
    @Inject
    private OrderRepository orderRepository;

    @BeforeEach
    public void setup() {
        repository.deleteAll();
    }

    private Long createGetId(CustomerCreateDTO customer) {
        HttpResponse<Object> response = client.create(customer);
        return Long.valueOf(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    // create the DTO, with some default values for fields
    private CustomerCreateDTO createDTO() {
        CustomerCreateDTO customer = new CustomerCreateDTO();
        customer.setEmail("user@testmail.com");
        customer.setFirstName("John");
        customer.setFamilyName("Test");

        return customer;
    }

    @Test
    public void noCustomers() {
        assertEquals(0, client.list().getContent().size());
    }

    @Test
    public void createCustomer() {
        CustomerCreateDTO dto = createDTO();
        long customerId = createGetId(dto);
        Customer customer = client.get(customerId);

        assertEquals(dto.getEmail(), customer.getEmail());
        assertEquals(dto.getFirstName(), customer.getFirstName());
        assertEquals(dto.getFamilyName(), customer.getFamilyName());
    }

    @Test
    public void getNonExistingCustomer() {
        assertNull(client.get(0L));
    }

    @Test
    public void updateCustomer() {
        CustomerCreateDTO customerDTO = createDTO();
        long customerId = createGetId(customerDTO);
        CustomerCreateDTO updateDTO = createDTO();
        updateDTO.setFamilyName("Update");

        client.update(customerId, updateDTO);
        Customer customer = client.get(customerId);

        assertEquals(updateDTO.getFamilyName(), customer.getFamilyName());
    }

    @Test
    public void updateNonExistingCustomer() {
        CustomerCreateDTO dto = createDTO();

        HttpResponse<Object> response = client.update(10L, dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteCustomer() {
        CustomerCreateDTO dto = createDTO();
        long customerId = createGetId(dto);

        client.delete(customerId);
        assertNull(client.get(customerId));
    }

    @Test
    public void deleteNonExistingCustomer() {
        HttpResponse<Object> response = client.delete(5L);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void listOrders() {
        CustomerCreateDTO dto = createDTO();
        long customerId = createGetId(dto);
        Customer customer = client.get(customerId);

        Order order = new Order();
        order.setCustomer(customer);
        order.setAddress("123 Test Lane");
        order.setPaid(false);
        order.setDelivered(false);
        order.setTotalAmount(BigDecimal.ZERO);
        order.setDateCreated(new Date(System.currentTimeMillis()));
        order.setOrderItems(new HashSet<>());

        long orderId = orderRepository.save(order).getId();

        List<Order> orders = client.listOrders(customerId);

        assertEquals(1, orders.size());
        assertEquals(orderId, orders.get(0).getId());
    }
}