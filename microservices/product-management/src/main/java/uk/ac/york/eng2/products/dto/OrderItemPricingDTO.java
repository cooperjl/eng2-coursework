package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;

@Serdeable
public class OrderItemPricingDTO {
    private Long productId;
    private Integer quantity;
    private BigDecimal unitPrice;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
