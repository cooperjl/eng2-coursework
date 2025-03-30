package uk.ac.york.eng2.products.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.net.URI;
import java.util.List;

@io.swagger.v3.oas.annotations.tags.Tag(name = "tags")
@Controller(TagsController.PREFIX)
public class TagsController {
    public static final String PREFIX = "/tags";

    @Inject
    private TagRepository repository;
    @Inject
    private ProductRepository productRepository;

    @Get("/{?page}")
    public Page<Tag> listTags(@QueryValue(defaultValue = "0") int page) {
        return repository.findAll(Pageable.from(page));
    }

    @Get("/{id}")
    public Tag getTag(@PathVariable long id) {
        return repository.findById(id).orElse(null);
    }

    @Get("/{id}/products")
    public List<Product> listProducts(@PathVariable long id) {
        return productRepository.findByTagsId(id);
    }

    @Post
    public HttpResponse<Object> createTag(@Body TagCreateDTO dto) {
        Tag tag = new Tag();
        tag.setName(dto.getName());

        tag = repository.save(tag);
        return HttpResponse.created(URI.create("%s/%d".formatted(PREFIX, tag.getId())));
    }

    @Transactional
    @Put("/{id}")
    public void updateTag(@PathVariable long id, @Body TagCreateDTO dto) {
        @NonNull Tag tag = repository.findById(id)
                .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found"));

        tag.setName(dto.getName());
    }

    @Delete("/{id}")
    public void deleteTag(@PathVariable long id) {
        if (!repository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }
        repository.deleteById(id);
    }
}
