package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

@Serdeable
public class OrderPricingDTO {
    @Schema(type = "string", format = "date")
    private Date dateCreated;
    private BigDecimal totalAmount;
    private Set<OrderItemPricingDTO> orderItems;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Set<OrderItemPricingDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItemPricingDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
