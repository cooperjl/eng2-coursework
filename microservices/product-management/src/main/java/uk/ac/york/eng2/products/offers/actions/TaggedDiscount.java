package uk.ac.york.eng2.products.offers.actions;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Prototype;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.OrderItemPricingDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Primary
@Prototype
public class TaggedDiscount extends ItemDiscount {
    protected String[] tagStrings;
    @Inject
    private TagRepository tagRepository;
    @Inject
    private ProductRepository productRepository;

    public TaggedDiscount() {}

    @Transactional
    public void apply(OrderPricingDTO order) {
        Set<Tag> tags = new HashSet<>();
        for (String tagString : tagStrings) {
            Optional<Tag> optionalTag = tagRepository.findByName(tagString);
            // do not continue if a tag is not found, as therefore no product will have that tag
            if (optionalTag.isEmpty()) {
                return;
            }
            tags.add(optionalTag.get());
        }
        BigDecimal totalAmount = order.getTotalAmount();
        for (OrderItemPricingDTO orderItem : order.getOrderItems()) {
            Optional<Product> optionalProduct = productRepository.findById(orderItem.getProductId());
            if (optionalProduct.isPresent()) {
                Product product = optionalProduct.get();
                Set<Tag> productTags = product.getTags();
                if (productTags.containsAll(tags)) {
                    totalAmount = calculateDiscounts(totalAmount, product.getUnitPrice(), orderItem.getQuantity());
                }
            }
        }
        order.setTotalAmount(totalAmount);
    }

    public void setTagStrings(String[] tagStrings) {
        this.tagStrings = tagStrings;
    }
}
