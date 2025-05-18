package uk.ac.york.eng2.products.offers.actions;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.BaseOfferTest;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class ProductDiscountTest extends BaseOfferTest {
    @Inject
    private ProductDiscount productDiscount;

    @Test
    public void applyProductPercentageDiscount() {
        OrderPricingDTO order = createDTO("Pizza");
        BigDecimal originalPrice = order.getTotalAmount();

        productDiscount.setProductString("Pizza");
        productDiscount.setPercentageDiscount(50.0);
        productDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(originalPrice.multiply(BigDecimal.valueOf(0.5))));
        order.setTotalAmount(originalPrice);
        productDiscount.setProductString("Burger");
        productDiscount.apply(order);
        assertEquals(originalPrice, order.getTotalAmount());
    }
    @Test
    public void applyProductPriceDiscount() {
        OrderPricingDTO order = createDTO("Pizza");
        BigDecimal originalPrice = order.getTotalAmount();

        productDiscount.setProductString("Pizza");
        productDiscount.setPriceDiscount(3.0);
        productDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(originalPrice.subtract(BigDecimal.valueOf(3.0))));
        order.setTotalAmount(originalPrice);
        productDiscount.setProductString("Burger");
        productDiscount.apply(order);
        assertEquals(originalPrice, order.getTotalAmount());
    }
    @Test
    public void applyProductSetPrice() {
        OrderPricingDTO order = createDTO("Pizza");
        BigDecimal originalPrice = order.getTotalAmount();

        productDiscount.setProductString("Pizza");
        productDiscount.setSetPrice(1.0);
        productDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(1.0)));
        order.setTotalAmount(originalPrice);
        productDiscount.setProductString("Burger");
        productDiscount.apply(order);
        assertEquals(originalPrice, order.getTotalAmount());
    }
    @Test
    public void applyProductQuantityDiscount() {
        OrderPricingDTO order = createDTO("Pizza");
        BigDecimal originalPrice = order.getTotalAmount();

        productDiscount.setProductString("Pizza");
        productDiscount.setQuantityDiscount(1);
        productDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(0.0)));
        order.setTotalAmount(originalPrice);
        productDiscount.setProductString("Burger");
        productDiscount.apply(order);
        assertEquals(originalPrice, order.getTotalAmount());
        // Ensure does not allow negative quantity
        productDiscount.setProductString("Pizza");
        productDiscount.setQuantityDiscount(5);
        productDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(BigDecimal.valueOf(0.0)));

        // Assert does not apply on invalid product
        order.setTotalAmount(originalPrice);
        order.getOrderItems().stream().findFirst().get().setProductId(99L);
        productDiscount.apply(order);
        assertThat(order.getTotalAmount(), Matchers.comparesEqualTo(originalPrice));
    }
}