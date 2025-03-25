package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.Prices;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;

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
        repository.deleteAll();
        ordersByDayRepository.deleteAll();
        tagRepository.deleteAll();
    }

    private Long createGetId(String name, float unitPrice) {
        var product = new ProductCreateDTO();
        product.setName(name);
        product.setUnitPrice(BigDecimal.valueOf(unitPrice));

        HttpResponse<Object> response = client.create(product);
        return Long.valueOf(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    @Test
    public void noProducts() {
        assertEquals(0, client.list().getContent().size());
    }

    @Test
    public void createProduct() {
        var product = new ProductCreateDTO();
        product.setName("Test Name");
        product.setUnitPrice(BigDecimal.valueOf(1.25));

        var productId = createGetId("Test Name", 1.25F);
        var gotProduct = client.get(productId);

        assertEquals(product.getName(), gotProduct.getName());
        assertEquals(product.getUnitPrice(), gotProduct.getUnitPrice());
    }

    @Test
    public void getNonExistingProduct() {
        assertNull(client.get(0L));
    }

    @Test
    public void updateProduct() {
        long productId = createGetId("Test Name 1", 1.0F);
        var dto = new ProductCreateDTO();
        dto.setName("Test Name 2");
        dto.setUnitPrice(BigDecimal.valueOf(2.0));

        client.update(productId, dto);

        Product product = client.get(productId);
        assertEquals(dto.getName(), product.getName());
        assertThat(dto.getUnitPrice(), Matchers.comparesEqualTo(product.getUnitPrice()));
    }

    @Test
    public void deleteProduct() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(BigDecimal.valueOf(1.0));
        product = repository.save(product);

        client.delete(product.getId());
        assertNull(client.get(product.getId()));
    }

    @Test
    public void updateNonExistingProduct() {
        var dto = new ProductCreateDTO();
        dto.setName("Test Name");
        dto.setUnitPrice(BigDecimal.valueOf(1.0));

        HttpResponse<Object> response = client.update(10L, dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteNonExistingProduct() {
        HttpResponse<Object> response = client.delete(5L);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void getUnitPrice() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(BigDecimal.valueOf(1.2));
        product = repository.save(product);

        Prices prices = client.getPrices(product.getId(), 1);

        assertThat(product.getUnitPrice(), Matchers.comparesEqualTo(prices.unitPrice()));
    }

    @Test
    public void getTotalPrice() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(BigDecimal.valueOf(1.4));
        product = repository.save(product);

        Prices prices = client.getPrices(product.getId(), 5);

        assertThat(BigDecimal.valueOf(5).multiply(product.getUnitPrice()), Matchers.comparesEqualTo(prices.totalPrice()));
    }
}
