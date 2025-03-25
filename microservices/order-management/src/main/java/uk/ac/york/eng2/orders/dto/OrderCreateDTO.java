package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Set;

@Serdeable
public class OrderCreateDTO {
    private String address;
    private Long customerId;
    private Set<OrderItemCreateDTO> orderItems;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Set<OrderItemCreateDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItemCreateDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
