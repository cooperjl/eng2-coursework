package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.Schema;

import java.sql.Date;
import java.util.Set;

@Serdeable
public class OrderPricingCreateDTO {
    @Schema(type = "string", format = "date")
    private Date dateCreated;
    private Set<OrderItemPricingCreateDTO> orderItems;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Set<OrderItemPricingCreateDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItemPricingCreateDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
