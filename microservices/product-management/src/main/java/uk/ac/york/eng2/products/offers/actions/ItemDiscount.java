package uk.ac.york.eng2.products.offers.actions;

import java.math.BigDecimal;

public abstract class ItemDiscount {
    protected double percentageDiscount;
    protected double priceDiscount;
    protected double setPrice;
    protected int quantityDiscount;

    public ItemDiscount() {}

    protected BigDecimal calculateDiscounts(BigDecimal totalAmount, BigDecimal unitPrice, int quantity) {
        // Subtract price difference between setPrice and unitPrice
        if (setPrice != 0) {
            totalAmount = totalAmount.subtract(unitPrice.subtract(BigDecimal.valueOf(setPrice)).multiply(BigDecimal.valueOf(quantity)));
            unitPrice = BigDecimal.valueOf(setPrice);
        }
        // Apply price discount to total
        totalAmount = totalAmount.subtract(BigDecimal.valueOf(priceDiscount));

        // Apply percentage discount using unitPrice
        totalAmount = totalAmount.subtract(unitPrice.multiply(BigDecimal.valueOf(percentageDiscount / 100.0)));

        // Deal with greater quantityDiscount than quantity
        int quantityDiscountBounded = Math.min(quantityDiscount, quantity);
        // Apply quantity discount
        totalAmount = totalAmount.subtract(unitPrice.multiply(BigDecimal.valueOf(quantityDiscountBounded)));

        // Limit the minimum price to zero
        totalAmount = totalAmount.max(BigDecimal.ZERO);

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

    public void setQuantityDiscount(int quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
    }
}
