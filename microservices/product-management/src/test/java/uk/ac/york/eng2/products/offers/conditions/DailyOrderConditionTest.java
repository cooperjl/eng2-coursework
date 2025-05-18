package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import uk.ac.york.eng2.products.dto.OrderPricingDTO;

import uk.ac.york.eng2.products.events.OrderConsumer;
import uk.ac.york.eng2.products.events.OrderInfo;
import uk.ac.york.eng2.products.offers.BaseOfferTest;
import uk.ac.york.eng2.products.offers.Comparison;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class DailyOrderConditionTest extends BaseOfferTest {
    @Inject
    private OrderConsumer consumer;
    @Inject
    private DailyOrderCondition dailyOrderCondition;

    @Test
    public void evalDailyOrderCondition() {
        OrderPricingDTO order = createDTO("Pizza");
        dailyOrderCondition.setThreshold(3);
        dailyOrderCondition.setComparison(Comparison.GREATER_THAN);
        dailyOrderCondition.setProductString("Pizza");

        assertFalse(dailyOrderCondition.eval(order));

        OrderInfo orderInfo = new OrderInfo(order.getDateCreated(), 4);
        Long productId = order.getOrderItems().stream().findFirst().get().getProductId();
        consumer.orderPlaced(productId, orderInfo);

        assertTrue(dailyOrderCondition.eval(order));

        // Assert false on invalid product
        order.getOrderItems().stream().findFirst().get().setProductId(99L);
        assertFalse(dailyOrderCondition.eval(order));
    }
}
