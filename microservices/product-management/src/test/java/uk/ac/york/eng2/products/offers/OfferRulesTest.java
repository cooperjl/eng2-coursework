package uk.ac.york.eng2.products.offers;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.OrderItemPricingDTO;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.events.OrderConsumer;
import uk.ac.york.eng2.products.events.OrderInfo;
import uk.ac.york.eng2.products.offers.gen.OfferRules;
import uk.ac.york.eng2.products.resources.ProductsClient;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class OfferRulesTest extends BaseOfferTest {
    @Inject
    private OfferRules offerRules;
    @Inject
    private ProductsClient productsClient;
    @Inject
    private OrderConsumer consumer;

    @Test
    public void applyGeneratedBakewellOffer() {
        OrderPricingDTO order = createDTO("Bakewell Tart");
        long productId = order.getOrderItems().stream().findFirst().get().getProductId();
        BigDecimal originalPrice = order.getTotalAmount();

        // Place 1 order to start tracking today's orders of bakewell tarts
        // Since for an order to need calculating an order must have been
        // placed, this follows a real world use case.
        OrderInfo orderInfo = new OrderInfo(order.getDateCreated(), 1);
        consumer.orderPlaced(productId, orderInfo);

        offerRules.applyOfferRules(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(3.825)));

        order.setTotalAmount(originalPrice);
        orderInfo = new OrderInfo(order.getDateCreated(), 11);
        consumer.orderPlaced(productId, orderInfo);
        assertEquals(order.getTotalAmount(), originalPrice);
    }

    @Test
    public void applyGeneratedPizzaOffers() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setUnitPrice(BigDecimal.valueOf(7.99));
        productCreateDTO.setName("Specialty Pizza");
        HttpResponse<Object> response = productsClient.create(productCreateDTO);
        long productId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        OrderItemPricingDTO orderItemDTO = new OrderItemPricingDTO();
        orderItemDTO.setProductId(productId);
        orderItemDTO.setQuantity(2);
        orderItemDTO.setUnitPrice(BigDecimal.valueOf(7.99));
        HashSet<OrderItemPricingDTO> orderItems = new HashSet<>();
        orderItems.add(orderItemDTO);
        OrderPricingDTO order = new OrderPricingDTO();
        order.setOrderItems(orderItems);
        Date day = new Date(System.currentTimeMillis());
        order.setDateCreated(day);
        order.setTotalAmount(BigDecimal.valueOf(7.99).multiply(BigDecimal.valueOf(2)));
        BigDecimal originalPrice = order.getTotalAmount();

        TagCreateDTO largeTagDTO = new TagCreateDTO();
        largeTagDTO.setName("large");
        long largeTagId = createTagGetId(largeTagDTO);

        TagCreateDTO pizzaTagDTO = new TagCreateDTO();
        pizzaTagDTO.setName("pizza");
        long pizzaTagId = createTagGetId(pizzaTagDTO);

        productsClient.addProductTag(productId, pizzaTagId);

        // Test the two non-large pizza offer
        offerRules.applyOfferRules(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(orderItemDTO.getUnitPrice()));

        // Test the two large pizzas offer
        order.setTotalAmount(originalPrice);
        productsClient.addProductTag(productId, largeTagId);

        offerRules.applyOfferRules(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(10)));

        ProductCreateDTO iceCreamCreateDTO = new ProductCreateDTO();
        iceCreamCreateDTO.setUnitPrice(BigDecimal.valueOf(4.25));
        iceCreamCreateDTO.setName("Large Ice Cream");
        response = productsClient.create(iceCreamCreateDTO);
        long iceCreamId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        TagCreateDTO iceCreamTagDTO = new TagCreateDTO();
        iceCreamTagDTO.setName("ice cream");
        long iceCreamTagId = createTagGetId(iceCreamTagDTO);

        productsClient.addProductTag(iceCreamId, largeTagId);
        productsClient.addProductTag(iceCreamId, iceCreamTagId);

        OrderItemPricingDTO iceCreamItemDTO = new OrderItemPricingDTO();
        iceCreamItemDTO.setProductId(iceCreamId);
        iceCreamItemDTO.setQuantity(1);
        iceCreamItemDTO.setUnitPrice(BigDecimal.valueOf(4.25));
        orderItems.add(iceCreamItemDTO);
        order.setOrderItems(orderItems);
        order.setTotalAmount(originalPrice.add(iceCreamItemDTO.getUnitPrice()));

        offerRules.applyOfferRules(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(10)));
    }

    @Test
    public void applyGeneratedChristmasOffers() {
        OrderPricingDTO order = createDTO("Chocolate Cake");
        // Unix timestamp which corresponds to 2025-12-25 10:00:00
        order.setDateCreated(new Date(1766656800000L));
        long productId = order.getOrderItems().stream().findFirst().get().getProductId();

        order.setTotalAmount(BigDecimal.valueOf(60.0));
        offerRules.applyOfferRules(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(54.0)));


        order.setTotalAmount(BigDecimal.valueOf(50.0));
        offerRules.applyOfferRules(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(50.0)));

        TagCreateDTO cakeTagDTO = new TagCreateDTO();
        cakeTagDTO.setName("cake");
        long cakeTagId = createTagGetId(cakeTagDTO);

        TagCreateDTO chocolateTagDTO = new TagCreateDTO();
        chocolateTagDTO.setName("chocolate");
        long chocolateTagId = createTagGetId(chocolateTagDTO);

        productsClient.addProductTag(productId, cakeTagId);
        productsClient.addProductTag(productId, chocolateTagId);

        offerRules.applyOfferRules(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(45.0)));
    }
}
