package uk.ac.york.eng2.products.events;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.math.BigDecimal;
import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@MicronautTest(transactional = false)
public class OrderConsumerTest {
    @Inject
    private OrdersByDayRepository repository;

    @Inject
    private ProductRepository productRepository;

    @Inject
    private OrderConsumer consumer;

    @BeforeEach
    public void setup() {
        repository.deleteAll();
        productRepository.deleteAll();
    }

    @Test
    public void newOrdersByDay() {
        Product product = new Product();
        product.setUnitPrice(BigDecimal.valueOf(1.0));
        product.setName("Test Product");
        product = productRepository.save(product);

        Date day = new Date(System.currentTimeMillis());
        OrderInfo orderInfo = new OrderInfo(day, 2);
        consumer.orderPlaced(product.getId(), orderInfo);

        OrdersByDay ordersByDay = repository.findByProductIdAndDay(product.getId(), day).get();
        assertEquals(product.getId(), ordersByDay.getProduct().getId());

        assertEquals(2, ordersByDay.getCount());
        consumer.orderPlaced(product.getId(), orderInfo);
        ordersByDay = repository.findByProductIdAndDay(product.getId(), day).get();
        assertEquals(4, ordersByDay.getCount());
    }

    @Test
    public void nonExistingProduct() {
        Date day = new Date(System.currentTimeMillis());
        OrderInfo orderInfo = new OrderInfo(day, 2);
        HttpStatusException exception = assertThrows(HttpStatusException.class, () -> consumer.orderPlaced(10L, orderInfo));
        assertEquals(HttpStatus.NOT_FOUND, exception.getStatus());
    }


}
