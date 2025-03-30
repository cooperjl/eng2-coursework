package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.Prices;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class ProductsControllerTest {
    @Inject
    private ProductsClient client;
    @Inject
    private ProductRepository repository;
    @Inject
    private TagRepository tagRepository;
    @Inject
    private OrdersByDayRepository ordersByDayRepository;

    @BeforeEach
    public void setup() {
        ordersByDayRepository.deleteAll();
        tagRepository.deleteAll();
        repository.deleteAll();
    }

    private Long createGetId(ProductCreateDTO product) {
        HttpResponse<Object> response = client.create(product);
        return Long.valueOf(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    // create the DTO, with some default values for fields
    private ProductCreateDTO createDTO() {
        ProductCreateDTO product = new ProductCreateDTO();
        product.setName("Test Name");
        product.setUnitPrice(BigDecimal.valueOf(1.25));

        return product;
    }

    @Test
    public void noProducts() {
        assertEquals(0, client.list().getContent().size());
    }

    @Test
    public void createProduct() {
        ProductCreateDTO dto = createDTO();
        long productId = createGetId(dto);
        Product product = client.get(productId);

        assertEquals(dto.getName(), product.getName());
        assertEquals(dto.getUnitPrice(), product.getUnitPrice());
    }

    @Test
    public void getNonExistingProduct() {
        assertNull(client.get(0L));
    }

    @Test
    public void updateProduct() {
        ProductCreateDTO productDTO = createDTO();
        long productId = createGetId(productDTO);
        ProductCreateDTO updateDTO = createDTO();
        updateDTO.setName("Updated Name");

        client.update(productId, updateDTO);
        Product product = client.get(productId);

        assertEquals(updateDTO.getName(), product.getName());
    }

    @Test
    public void updateNonExistingProduct() {
        ProductCreateDTO dto = createDTO();

        HttpResponse<Object> response = client.update(10L, dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteProduct() {
        ProductCreateDTO dto = createDTO();
        long productId = createGetId(dto);

        client.delete(productId);
        assertNull(client.get(productId));
    }

    @Test
    public void deleteNonExistingProduct() {
        HttpResponse<Object> response = client.delete(5L);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void getUnitPrice() {
        ProductCreateDTO dto = createDTO();
        long productId = createGetId(dto);

        Prices prices = client.getPrices(productId, 1);

        assertThat(dto.getUnitPrice(), Matchers.comparesEqualTo(prices.unitPrice()));
    }

    @Test
    public void getTotalPrice() {
        ProductCreateDTO dto = createDTO();
        long productId = createGetId(dto);

        Prices prices = client.getPrices(productId, 5);

        assertThat(BigDecimal.valueOf(5).multiply(dto.getUnitPrice()), Matchers.comparesEqualTo(prices.totalPrice()));
    }

    @Test
    public void listTags() {
        Tag tag = new Tag();
        tag.setName("Test Tag");
        tag = tagRepository.save(tag);

        ProductCreateDTO dto = createDTO();
        long productId = createGetId(dto);
        client.addProductTag(productId, tag.getId());
        List<Tag> productTags = client.listTags(productId);

        assertEquals(1, productTags.size());
        assertEquals(tag.getId(), productTags.get(0).getId());

        client.removeProductTag(productId, tag.getId());

        assertEquals(0, client.listTags(productId).size());
    }

    @Test
    public void getDailyOrders() {
        ProductCreateDTO dto = createDTO();
        long productId = createGetId(dto);
        Product product = client.get(productId);

        Date day = new Date(System.currentTimeMillis());

        OrdersByDay ordersByDay = new OrdersByDay();
        ordersByDay.setProduct(product);
        ordersByDay.setDay(day);
        ordersByDay.setCount(3);
        ordersByDay = ordersByDayRepository.save(ordersByDay);

        Map<String, Integer> stats = client.getDailyOrders(productId);

        assertEquals(ordersByDay.getCount(), stats.get(day.toString()));
    }
}
