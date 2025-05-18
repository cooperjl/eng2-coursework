package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Prototype;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.OrderItemPricingDTO;
import uk.ac.york.eng2.products.offers.Comparison;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.Optional;

@Primary
@Prototype
public class DailyOrderCondition {
    protected Comparison comparison;
    protected double threshold;
    protected String productString;
    @Inject
    private OrdersByDayRepository ordersByDayRepository;
    @Inject
    private ProductRepository productRepository;

    public DailyOrderCondition() {}

    @Transactional
    public boolean eval(OrderPricingDTO order) {
        Optional<Product> optionalProduct = productRepository.findByName(productString);
        if (optionalProduct.isEmpty()) {
            return false;
        }
        Product product = optionalProduct.get();

        for (OrderItemPricingDTO orderItem : order.getOrderItems()) {
            if (product.getId().equals(orderItem.getProductId())) {
                Optional<OrdersByDay> ordersByDay = ordersByDayRepository.findByProductIdAndDay(product.getId(), order.getDateCreated());
                if (ordersByDay.isPresent()) {
                    return comparison.compare(BigDecimal.valueOf(ordersByDay.get().getCount()), BigDecimal.valueOf(threshold));
                }
            }
        }
        // Fallback if the order by day isn't being tracked
        return false;
    }

    public void setComparison(Comparison comparison) {
        this.comparison = comparison;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public void setProductString(String productString) {
        this.productString = productString;
    }
}
