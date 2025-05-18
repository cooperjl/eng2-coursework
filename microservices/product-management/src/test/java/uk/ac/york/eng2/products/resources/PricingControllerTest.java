package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.*;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@MicronautTest(transactional = false)
public class PricingControllerTest {
    @Inject
    private PricingClient client;
    @Inject
    private ProductsClient productsClient;
    @Inject
    private TagsClient tagsClient;
    @Inject
    private TagRepository tagRepository;
    @Inject
    private ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        tagRepository.deleteAll();
        productRepository.deleteAll();
    }

    @Test
    public void priceOrder() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setUnitPrice(BigDecimal.valueOf(7.45));
        productCreateDTO.setName("Pizza");
        productsClient.create(productCreateDTO);
        HttpResponse<Object> response = productsClient.create(productCreateDTO);
        long productId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        TagCreateDTO tagDTO = new TagCreateDTO();
        tagDTO.setName("pizza");
        response = tagsClient.createTag(tagDTO);
        long tagId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        productsClient.addProductTag(productId, tagId);

        OrderItemPricingCreateDTO orderItemDTO = new OrderItemPricingCreateDTO();
        orderItemDTO.setProductId(productId);
        orderItemDTO.setQuantity(2);
        HashSet<OrderItemPricingCreateDTO> orderItems = new HashSet<>();
        orderItems.add(orderItemDTO);
        OrderPricingCreateDTO orderDTO = new OrderPricingCreateDTO();
        orderDTO.setOrderItems(orderItems);
        orderDTO.setDateCreated(new Date(System.currentTimeMillis()));

        OrderPricingDTO order = client.getPrices(orderDTO).getBody().get();
        OrderItemPricingDTO orderItem = order.getOrderItems().stream().findFirst().get();
        assertThat(orderItem.getUnitPrice(), Matchers.comparesEqualTo(BigDecimal.valueOf(7.45)));
        // Expected to be the price for one, as this order matches the two for one non-large pizza offer.
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(7.45)));

        // Ensure correctly responds with not found when invalid product id in order
        orderDTO.getOrderItems().stream().findFirst().get().setProductId(88L);
        assertEquals(HttpStatus.NOT_FOUND, client.getPrices(orderDTO).getStatus());
    }
}
