package uk.ac.york.eng2.products.offers.actions;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.BaseOfferTest;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;

@MicronautTest(transactional = false)
public class OrderDiscountTest extends BaseOfferTest {
    @Inject
    private OrderDiscount orderDiscount;

    @Test
    public void applyOrderDiscount() {
        OrderPricingDTO order = createDTO("Pizza");
        BigDecimal originalPrice = order.getTotalAmount();

        // Test percentage discount
        orderDiscount.setPercentageDiscount(50.0);
        orderDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(originalPrice.multiply(BigDecimal.valueOf(0.5))));
        orderDiscount.setPercentageDiscount(0.0);

        // Test price discount
        order.setTotalAmount(originalPrice);
        orderDiscount.setPriceDiscount(5.0);
        orderDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(originalPrice.subtract(BigDecimal.valueOf(5.0))));
        orderDiscount.setPriceDiscount(0.0);

        // Test set price
        order.setTotalAmount(originalPrice);
        orderDiscount.setSetPrice(51.7);
        orderDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(51.7)));
    }
}
