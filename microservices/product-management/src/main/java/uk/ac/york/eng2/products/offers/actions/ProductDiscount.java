package uk.ac.york.eng2.products.offers.actions;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Prototype;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.OrderItemPricingDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.Optional;

@Primary
@Prototype
public class ProductDiscount extends ItemDiscount {
    protected String productString;
    @Inject
    private ProductRepository productRepository;

    public ProductDiscount() {}

    public void apply(OrderPricingDTO order) {
        Optional<Product> optionalProduct = productRepository.findByName(productString);
        if (optionalProduct.isEmpty()) {
            return;
        }
        Product product = optionalProduct.get();

        BigDecimal totalAmount = order.getTotalAmount();
        for (OrderItemPricingDTO orderItem: order.getOrderItems()) {
            if (product.getId().equals(orderItem.getProductId())) {
                totalAmount = calculateDiscounts(totalAmount, product.getUnitPrice(), orderItem.getQuantity());
            }
        }
        order.setTotalAmount(totalAmount);
    }

    public void setProductString(String productString) {
        this.productString = productString;
    }
}
