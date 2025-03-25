package uk.ac.york.eng2.products.resources;

import io.micronaut.data.model.Page;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.Prices;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;

@Client(ProductsController.PREFIX)
public interface ProductsClient {
    @Get
    Page<Product> list();

    @Post
    HttpResponse<Object> create(@Body ProductCreateDTO dto);

    @Get("/{id}")
    Product get(@PathVariable long id);

    @Get("/{id}/price/{quantity}")
    Prices getPrices(@PathVariable long id, @PathVariable int quantity);

    @Put("/{id}")
    HttpResponse<Object> update(@PathVariable long id, @Body ProductCreateDTO dto);

    @Delete("/{id}")
    HttpResponse<Object> delete(@PathVariable long id);
}