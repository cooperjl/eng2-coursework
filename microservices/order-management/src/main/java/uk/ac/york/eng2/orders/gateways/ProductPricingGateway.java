package uk.ac.york.eng2.orders.gateways;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.product_management.api.PricingApi;
import uk.ac.york.eng2.orders.product_management.api.ProductsApi;
import uk.ac.york.eng2.orders.product_management.model.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Singleton
public class ProductPricingGateway {
    @Inject
    PricingApi pricingApi;

    public Optional<OrderPricingDTO> getPricedOrder(OrderCreateDTO dto, Date dateCreated) {
        try {
            OrderPricingCreateDTO orderPricingCreateDTO = new OrderPricingCreateDTO();
            List<OrderItemPricingCreateDTO> orderItems = new ArrayList<>();
            for (var orderItem : dto.getOrderItems()) {
                OrderItemPricingCreateDTO orderItemPricingCreateDTO = new OrderItemPricingCreateDTO();
                orderItemPricingCreateDTO.setProductId(orderItem.getProductId());
                orderItemPricingCreateDTO.setQuantity(orderItem.getQuantity());
                orderItems.add(orderItemPricingCreateDTO);
            }
            orderPricingCreateDTO.setOrderItems(orderItems);
            orderPricingCreateDTO.setDateCreated(dateCreated.toLocalDate());
            return Optional.of(pricingApi.getPrices(orderPricingCreateDTO));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }
}
