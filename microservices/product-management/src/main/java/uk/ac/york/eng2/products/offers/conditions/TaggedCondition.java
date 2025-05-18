package uk.ac.york.eng2.products.offers.conditions;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Primary
@Prototype
public class TaggedCondition {
    protected String[] tagStrings;
    @Inject
    private TagRepository tagRepository;
    @Inject
    private ProductRepository productRepository;

    public TaggedCondition() {}

    @Transactional
    public boolean eval(OrderPricingDTO order) {
        List<Tag> tagList = new ArrayList<>();
        for (var tagName : tagStrings) {
            Optional<Tag> optionalTag = tagRepository.findByName(tagName);
            if (optionalTag.isPresent()) {
                tagList.add(optionalTag.get());
            } else {
                return false;
            }
        }
        for (OrderItemPricingDTO orderItem : order.getOrderItems()) {
            Optional<Product> optionalProduct = productRepository.findById(orderItem.getProductId());
            if (optionalProduct.isPresent()) {
                Product product = optionalProduct.get();
                Set<Tag> productTags = product.getTags();
                if (productTags.containsAll(tagList)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setTagStrings(String[] tagStrings) {
        this.tagStrings = tagStrings;
    }
}
