package uk.ac.york.eng2.products.offers.actions;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Prototype;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;

import java.math.BigDecimal;

@Primary
@Prototype
public class OrderDiscount {
    protected double percentageDiscount;
    protected double priceDiscount;
    protected double setPrice;

    public OrderDiscount() {}

    public void apply(OrderPricingDTO order) {
        order.setTotalAmount(calculateDiscounts(order.getTotalAmount()));
    }

    private BigDecimal calculateDiscounts(BigDecimal totalAmount) {
        if (setPrice != 0.0) {
            return BigDecimal.valueOf(setPrice);
        }
        totalAmount = totalAmount.subtract(BigDecimal.valueOf(priceDiscount));
        totalAmount = totalAmount.subtract(totalAmount.multiply(BigDecimal.valueOf(percentageDiscount / 100.0)));
        return totalAmount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public void setSetPrice(double setPrice) {
        this.setPrice = setPrice;
    }
}
