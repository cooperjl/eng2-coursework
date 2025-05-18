package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Prototype;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.Comparison;

import java.math.BigDecimal;

@Primary
@Prototype
public class PriceCondition {
    protected double price;
    protected Comparison comparison;

    public PriceCondition() {}

    public boolean eval(OrderPricingDTO order) {
        return comparison.compare(order.getTotalAmount(), BigDecimal.valueOf(price));
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setComparison(Comparison comparison) {
        this.comparison = comparison;
    }
}
