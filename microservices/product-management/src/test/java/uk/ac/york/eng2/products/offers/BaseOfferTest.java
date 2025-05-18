package uk.ac.york.eng2.products.offers;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.dto.OrderItemPricingDTO;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;
import uk.ac.york.eng2.products.resources.ProductsClient;
import uk.ac.york.eng2.products.resources.TagsClient;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;

public abstract class BaseOfferTest {
    @Inject
    private ProductsClient productsClient;
    @Inject
    private TagsClient tagsClient;
    @Inject
    private ProductRepository productRepository;
    @Inject
    private TagRepository tagRepository;
    @Inject
    private OrdersByDayRepository ordersByDayRepository;

    @BeforeEach
    public void setup() {
        ordersByDayRepository.deleteAll();
        tagRepository.deleteAll();
        productRepository.deleteAll();
    }
    protected Long createTagGetId(TagCreateDTO tag) {
        HttpResponse<Object> response = tagsClient.createTag(tag);
        return Long.valueOf(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    protected OrderPricingDTO createDTO(String productName) {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setUnitPrice(BigDecimal.valueOf(4.25));
        productCreateDTO.setName(productName);
        HttpResponse<Object> response = productsClient.create(productCreateDTO);
        Long productId = Long.valueOf(response.header(HttpHeaders.LOCATION).split("/")[2]);

        OrderItemPricingDTO orderItemDTO = new OrderItemPricingDTO();
        orderItemDTO.setProductId(productId);
        orderItemDTO.setQuantity(1);
        orderItemDTO.setUnitPrice(BigDecimal.valueOf(4.25));
        HashSet<OrderItemPricingDTO> orderItems = new HashSet<>();
        orderItems.add(orderItemDTO);
        OrderPricingDTO orderDTO = new OrderPricingDTO();
        orderDTO.setOrderItems(orderItems);
        Date day = new Date(System.currentTimeMillis());
        orderDTO.setDateCreated(day);
        orderDTO.setTotalAmount(BigDecimal.valueOf(4.25));

        return orderDTO;
    }
}
