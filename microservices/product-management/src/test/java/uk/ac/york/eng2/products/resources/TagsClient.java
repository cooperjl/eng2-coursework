package uk.ac.york.eng2.products.resources;

import io.micronaut.data.model.Page;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.TagCreateDTO;

import java.util.List;

@Client(TagsController.PREFIX)
public interface TagsClient {
    @Get
    Page<Tag> listTags();

    @Get("/{id}")
    Tag getTag(@PathVariable long id);

    @Get("/{id}/products")
    List<Product> listProducts(@PathVariable long id);

    @Post
    HttpResponse<Object> createTag(@Body TagCreateDTO dto);

    @Put("/{id}")
    HttpResponse<Object> updateTag(@PathVariable long id, @Body TagCreateDTO dto);

    @Delete("/{id}")
    HttpResponse<Object> deleteTag(@PathVariable long id);
}
