package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@MicronautTest(transactional = false)
public class TagsControllerTest {
    @Inject
    private TagsClient client;
    @Inject
    private ProductsClient productsClient;
    @Inject
    private TagRepository repository;

    @BeforeEach
    public void setup() {
        repository.deleteAll();
    }

    private Long createGetId(TagCreateDTO tag) {
        HttpResponse<Object> response = client.createTag(tag);
        return Long.valueOf(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    @Test
    public void noTags() {
        assertEquals(0, client.listTags().getContent().size());
    }

    @Test
    public void createTag() {
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Test Tag");
        long tagId = createGetId(dto);
        Tag tag = client.getTag(tagId);

        assertEquals(dto.getName(), tag.getName());
    }

    @Test
    public void getNonExistingTag() {
        assertNull(client.getTag(0L));
    }

    @Test
    public void updateTag() {
        TagCreateDTO tagDTO = new TagCreateDTO();
        tagDTO.setName("Tag 1");
        long tagId = createGetId(tagDTO);
        TagCreateDTO updateDTO = new TagCreateDTO();
        updateDTO.setName("Tag 2");

        client.updateTag(tagId, updateDTO);
        Tag tag = client.getTag(tagId);

        assertEquals(updateDTO.getName(), tag.getName());
    }

    @Test
    public void updateNonExistingTag() {
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Test Tag");

        HttpResponse<Object> response = client.updateTag(10L, dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteTag() {
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Test Tag");
        long tagId = createGetId(dto);

        client.deleteTag(tagId);
        assertNull(client.getTag(tagId));
    }

    @Test
    public void deleteNonExistingTag() {
        HttpResponse<Object> response = client.deleteTag(5L);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void listProducts() {
        ProductCreateDTO productDTO = new ProductCreateDTO();
        productDTO.setName("Test Product");
        productDTO.setUnitPrice(BigDecimal.ONE);

        // Product owns the relationship
        HttpResponse<Object> response = productsClient.create(productDTO);
        long productId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Test Tag");
        long tagId = createGetId(dto);

        productsClient.addProductTag(productId, tagId);

        List<Product> tagProducts = client.listProducts(tagId);

        // Do not test removing, as cannot remove from tags side.
        assertEquals(1, tagProducts.size());
        assertEquals(productId, tagProducts.get(0).getId());
    }

}