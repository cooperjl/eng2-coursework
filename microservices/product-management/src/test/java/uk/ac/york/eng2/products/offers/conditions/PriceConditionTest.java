package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.BaseOfferTest;
import uk.ac.york.eng2.products.offers.Comparison;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(transactional = false)
public class PriceConditionTest extends BaseOfferTest {
    @Inject
    private PriceCondition priceCondition;

    @Test
    public void evalPriceCondition() {
        priceCondition.setComparison(Comparison.GREATER_THAN);
        priceCondition.setPrice(5.0);
        OrderPricingDTO order = createDTO("Pizza");

        assertFalse(priceCondition.eval(order));
        priceCondition.setComparison(Comparison.LESS_THAN);
        assertTrue(priceCondition.eval(order));
    }
}
