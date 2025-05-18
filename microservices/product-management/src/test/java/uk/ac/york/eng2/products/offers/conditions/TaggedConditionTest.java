package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.offers.BaseOfferTest;
import uk.ac.york.eng2.products.resources.ProductsClient;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(transactional = false)
public class TaggedConditionTest extends BaseOfferTest {
    @Inject
    private TaggedCondition taggedCondition;
    @Inject
    private ProductsClient productsClient;

    @Test
    public void evalTaggedCondition() {
        OrderPricingDTO order = createDTO("Pizza");

        taggedCondition.setTagStrings(new String[] {"pizza", "tomato"});
        assertFalse(taggedCondition.eval(order));

        TagCreateDTO pizzaTagDTO = new TagCreateDTO();
        pizzaTagDTO.setName("pizza");
        long pizzaTagId = createTagGetId(pizzaTagDTO);

        TagCreateDTO tomatoTagDTO = new TagCreateDTO();
        tomatoTagDTO.setName("tomato");
        long tomatoTagId = createTagGetId(tomatoTagDTO);

        Long productId = order.getOrderItems().stream().findFirst().get().getProductId();
        productsClient.addProductTag(productId, tomatoTagId);
        productsClient.addProductTag(productId, pizzaTagId);
        assertTrue(taggedCondition.eval(order));

        // Assert false on invalid product
        order.getOrderItems().stream().findFirst().get().setProductId(99L);
        assertFalse(taggedCondition.eval(order));

        productsClient.removeProductTag(productId, pizzaTagId);
        assertFalse(taggedCondition.eval(order));
    }
}
