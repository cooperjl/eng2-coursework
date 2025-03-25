package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class OrderItemCreateDTO {
    private Long productId;
    private Integer quantity;

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
}
