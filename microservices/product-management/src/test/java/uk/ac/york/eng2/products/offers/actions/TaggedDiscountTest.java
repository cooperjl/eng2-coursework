package uk.ac.york.eng2.products.offers.actions;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.OrderItemPricingDTO;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.offers.BaseOfferTest;
import uk.ac.york.eng2.products.resources.ProductsClient;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class TaggedDiscountTest extends BaseOfferTest {
    @Inject
    private TaggedDiscount taggedDiscount;
    @Inject
    private ProductsClient productsClient;

    private void createAddTag(OrderPricingDTO order, String tagName) {
        TagCreateDTO tagDTO = new TagCreateDTO();
        tagDTO.setName(tagName);
        long tagId = createTagGetId(tagDTO);

        Long productId = order.getOrderItems().stream().findFirst().get().getProductId();
        productsClient.addProductTag(productId, tagId);
    }

    // Shared abstract base class functions for discounts for this and ProductDiscount
    // tested in ProductDiscountTest; this test is for the logic of applying using the tag
    @Test
    public void applyTaggedDiscount() {
        OrderPricingDTO order = createDTO("Large Pizza");
        BigDecimal originalPrice = order.getTotalAmount();

        // Set state of discount for testing
        taggedDiscount.setTagStrings(new String[]{"pizza", "large"});
        taggedDiscount.setPercentageDiscount(50.0);
        taggedDiscount.setPriceDiscount(0.0);
        taggedDiscount.setQuantityDiscount(0);
        taggedDiscount.setSetPrice(0.0);

        taggedDiscount.apply(order);
        assertEquals(originalPrice, order.getTotalAmount());
        createAddTag(order, "pizza");
        taggedDiscount.apply(order);
        assertEquals(originalPrice, order.getTotalAmount());
        createAddTag(order, "large");
        taggedDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(originalPrice.multiply(BigDecimal.valueOf(0.5))));

        // Assert does not apply on invalid product
        order.setTotalAmount(originalPrice);
        order.getOrderItems().stream().findFirst().get().setProductId(99L);
        taggedDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(originalPrice));
    }
}