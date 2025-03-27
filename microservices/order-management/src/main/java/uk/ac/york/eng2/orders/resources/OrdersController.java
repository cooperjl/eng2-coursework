package uk.ac.york.eng2.orders.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderItemCreateDTO;
import uk.ac.york.eng2.orders.events.OrderEventProducer;
import uk.ac.york.eng2.orders.events.OrderInfo;
import uk.ac.york.eng2.orders.gateways.ProductPricingGateway;
import uk.ac.york.eng2.orders.gateways.ProductPricingInfo;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.net.URI;
import java.sql.Date;
import java.util.Optional;

@Tag(name = "orders")
@ExecuteOn(TaskExecutors.BLOCKING)
@Controller(OrdersController.PREFIX)
public class OrdersController {
    public static final String PREFIX = "/orders";

    @Inject
    private OrdersRepository repository;
    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private OrderItemRepository orderItemRepository;
    @Inject
    private OrderEventProducer producer;
    @Inject
    private ProductPricingGateway gateway;

    private Orders dtoToOrder(OrderCreateDTO dto, Orders order) {
        Customer customer = customerRepository.findById(dto.getCustomerId())
                .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found"));

        order.setCustomer(customer);
        order.setAddress(dto.getAddress());
        order.setDateCreated(new Date(System.currentTimeMillis()));
        order.setDelivered(false);
        order.setPaid(false);
        order.setTotalAmount(BigDecimal.ZERO);

        order = repository.save(order);

        for (OrderItemCreateDTO orderItemDTO : dto.getOrderItems()) {
            OrderItem orderItem = new OrderItem(orderItemDTO.getProductId(), orderItemDTO.getQuantity());
            orderItem.setOrder(order);
            Optional<ProductPricingInfo> optionalInfo = gateway.getPricingInfo(orderItemDTO.getProductId(), orderItemDTO.getQuantity());
            if (optionalInfo.isEmpty()) {
                throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Pricing info unable to be retrieved from product microservice");
            }
            ProductPricingInfo info = optionalInfo.get();
            orderItem.setUnitPrice(info.unitPrices());
            // send event with the total price of the item to be added to the order's total price
            producer.pricingInfo(orderItemDTO.getProductId(), info);
            orderItemRepository.save(orderItem);
        }

        return order;
    }

    @Get("/{?page}")
    public Page<Orders> list(@QueryValue(defaultValue = "0") int page) {
        return repository.findAll(Pageable.from(page));
    }

    @Get("/{id}")
    public Orders get(@PathVariable long id) {
        return repository.findById(id).orElse(null);
    }

    @Get("/{id}/items")
    public Page<OrderItem> listItems(@PathVariable long id, @QueryValue(defaultValue = "0") int page) {
        return orderItemRepository.findByOrderId(id, Pageable.from(page));
    }

    @Get("/{id}/customer")
    public Customer getCustomer(@PathVariable long id) {
        return customerRepository.findByOrdersId(id).orElse(null);
    }

    @Post
    public HttpResponse<Object> create(@Body OrderCreateDTO dto) {
        Orders order = new Orders();
        order = dtoToOrder(dto, order);
        Date day = order.getDateCreated();

        // Produce Kafka records for each product in the order
        for (OrderItem orderItem : orderItemRepository.findByOrderId(order.getId(), Pageable.UNPAGED).getContent()) {
            producer.orderPlaced(orderItem.getProductId(), new OrderInfo(day, orderItem.getQuantity()));
        }

        return HttpResponse.created(URI.create("%s/%d".formatted(PREFIX, order.getId())));
    }

    @Transactional
    @Put("/{id}")
    public void update(@PathVariable long id, @Body OrderCreateDTO dto) {
        @NonNull Orders order = repository.findById(id)
                .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found"));

        dtoToOrder(dto, order);
    }

    @Delete("/{id}")
    public void delete(@PathVariable long id) {
        if (!repository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        repository.deleteById(id);
    }
}
