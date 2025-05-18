package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Prototype;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.OrderItemPricingDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.util.Optional;

@Primary
@Prototype
public class ProductCondition {
    protected String productString;
    @Inject
    private ProductRepository productRepository;

    public ProductCondition() {}

    public boolean eval(OrderPricingDTO order) {
        Optional<Product> optionalProduct = productRepository.findByName(productString);
        if (optionalProduct.isEmpty()) {
            return false;
        }

        Product product = optionalProduct.get();

        for (OrderItemPricingDTO orderItem : order.getOrderItems()) {
            if (product.getId().equals(orderItem.getProductId())) {
                return true;
            }
        }
        return false;
    }

    public void setProductString(String productString) {
        this.productString = productString;
    }
}
