package uk.ac.york.eng2.orders.events;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.gateways.ProductPricingInfo;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;

@MicronautTest(transactional = false)
public class PricingConsumerTest {
    @Inject
    private OrdersRepository repository;
    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private PricingConsumer consumer;

    @BeforeEach
    public void setup() {
        repository.deleteAll();
    }

    private Customer createCustomer() {
        Customer customer = new Customer();
        customer.setEmail("user@testmail.com");
        customer.setFirstName("John");
        customer.setFamilyName("Test");
        customer = customerRepository.save(customer);
        return customer;
    }

    @Test
    public void updateTotalPrice() {
        Orders order = new Orders();
        order.setTotalAmount(BigDecimal.ZERO);
        order.setPaid(false);
        order.setDelivered(false);
        order.setAddress("address");
        order.setCustomer(createCustomer());
        order.setOrderItems(Collections.emptySet());
        order.setDateCreated(new Date(System.currentTimeMillis()));
        order = repository.save(order);

        ProductPricingInfo info = new ProductPricingInfo(BigDecimal.ONE, BigDecimal.TEN);

        consumer.pricingInfo(order.getId(), info);
        assertThat(BigDecimal.valueOf(10), Matchers.comparesEqualTo(repository.findById(order.getId()).get().getTotalAmount()));
        consumer.pricingInfo(order.getId(), info);
        assertThat(BigDecimal.valueOf(20), Matchers.comparesEqualTo(repository.findById(order.getId()).get().getTotalAmount()));
    }

}
