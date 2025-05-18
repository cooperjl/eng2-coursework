package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrderItemPricingCreateDTO;
import uk.ac.york.eng2.products.dto.OrderPricingCreateDTO;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.OrderItemPricingDTO;
import uk.ac.york.eng2.products.offers.gen.OfferRules;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.HashSet;

@io.swagger.v3.oas.annotations.tags.Tag(name = "pricing")
@Controller(PricingController.PREFIX)
public class PricingController {
    public static final String PREFIX = "/pricing";

    @Inject
    private ProductRepository productRepository;
    @Inject
    private OfferRules offerRules;

    @Post
    public OrderPricingDTO getPrices(@Body OrderPricingCreateDTO orderCreate) {
        OrderPricingDTO order = new OrderPricingDTO();
        HashSet<OrderItemPricingDTO> orderItems = new HashSet<>();
        order.setDateCreated(orderCreate.getDateCreated());
        BigDecimal totalAmount = BigDecimal.ZERO;
        // Calculate base total and unit prices
        for (OrderItemPricingCreateDTO orderItemCreate : orderCreate.getOrderItems()) {
            Product product = productRepository.findById(orderItemCreate.getProductId())
                    .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found"));
            OrderItemPricingDTO orderItem = new OrderItemPricingDTO();
            orderItem.setQuantity(orderItemCreate.getQuantity());
            orderItem.setProductId(orderItemCreate.getProductId());
            orderItem.setUnitPrice(product.getUnitPrice());
            orderItems.add(orderItem);
            totalAmount = totalAmount.add(orderItem.getUnitPrice().multiply(BigDecimal.valueOf(orderItem.getQuantity())));
        }
        order.setTotalAmount(totalAmount);
        order.setOrderItems(orderItems);
        // Apply offers to order
        offerRules.applyOfferRules(order);
        return order;
    }
}
