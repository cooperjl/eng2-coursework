package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.BaseOfferTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(transactional = false)
public class ProductConditionTest extends BaseOfferTest {
    @Inject
    private ProductCondition productCondition;

    @Test
    public void evalProductCondition() {
        OrderPricingDTO order = createDTO("Pizza");
        productCondition.setProductString("Burger");

        assertFalse(productCondition.eval(order));

        productCondition.setProductString("Pizza");

        assertTrue(productCondition.eval(order));

        // Assert false on invalid product
        order.getOrderItems().stream().findFirst().get().setProductId(99L);
        assertFalse(productCondition.eval(order));
    }
}
