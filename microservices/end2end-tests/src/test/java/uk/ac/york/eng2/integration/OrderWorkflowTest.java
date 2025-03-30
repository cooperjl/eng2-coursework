package uk.ac.york.eng2.integration;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.integration.order_management.api.CustomersApi;
import uk.ac.york.eng2.integration.order_management.api.OrdersApi;
import uk.ac.york.eng2.integration.order_management.model.*;
import uk.ac.york.eng2.integration.product_management.api.ProductsApi;
import uk.ac.york.eng2.integration.product_management.model.ProductCreateDTO;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

import static org.awaitility.Awaitility.await;

@MicronautTest
public class OrderWorkflowTest {
    @Inject
    private ProductsApi productsApi;
    @Inject
    private OrdersApi ordersApi;
    @Inject
    private CustomersApi customersApi;

    @Test
    public void createOrderWithPricingInfo() {
        // Create product
        ProductCreateDTO product = new ProductCreateDTO();
        product.setName("Test Name");
        product.setUnitPrice(BigDecimal.valueOf(6.71));

        HttpResponse<Object> response = productsApi.create(product);
        long productId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        // Create customer, as required for order
        CustomerCreateDTO customer = new CustomerCreateDTO();
        // Use random in email, as email is unique in db.
        // This avoids needing to purge the db every run of the end to end tests on a test production db.
        Random random = new Random();
        customer.setEmail("user" + random.nextInt() + "@testmail.com");
        customer.setFirstName("John");
        customer.setFamilyName("Test");

        response = customersApi.create(customer);
        long customerId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        // Create order
        OrderCreateDTO order = new OrderCreateDTO();

        List<OrderItemCreateDTO> orderItems = new ArrayList<>();
        OrderItemCreateDTO orderItem = new OrderItemCreateDTO();
        orderItem.setProductId(productId);
        orderItem.setQuantity(4);
        orderItems.add(orderItem);

        order.setAddress("23 Test Avenue");
        order.setCustomerId(customerId);
        order.setOrderItems(orderItems);

        response = ordersApi.create1(order);
        long orderId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        // Test getting prices from product management api into order management
        await().atMost(Duration.ofSeconds(10)).until(unitPriceBecomes(orderId, BigDecimal.valueOf(6.71)));
        await().atMost(Duration.ofSeconds(10)).until(totalPriceBecomes(orderId, BigDecimal.valueOf(6.71).multiply(BigDecimal.valueOf(4))));

        // Test orders by day producing from order management and consuming from product management
        String currentDay = ordersApi.get1(orderId).body().getDateCreated().toString();
        await().atMost(Duration.ofSeconds(10)).until(dailyOrdersBecomes(productId, currentDay));
    }

    protected Callable<Boolean> unitPriceBecomes(long orderId, BigDecimal unitPrice) {
        return () -> {
            BigDecimal unitPriceResponse = ordersApi.listItems(orderId, 0).body().getContent().get(0).getUnitPrice();
            return unitPriceResponse.equals(unitPrice);
        };
    }

    protected Callable<Boolean> totalPriceBecomes(long orderId, BigDecimal totalPrice) {
        return () -> {
            BigDecimal totalPriceResponse = ordersApi.get1(orderId).body().getTotalAmount();
            return totalPriceResponse.equals(totalPrice);
        };
    }

    protected Callable<Boolean> dailyOrdersBecomes(long productId, String currentDay) {
        return () -> productsApi.getDailyOrders(productId, 0).body().get(currentDay).equals(4);
    }
}
