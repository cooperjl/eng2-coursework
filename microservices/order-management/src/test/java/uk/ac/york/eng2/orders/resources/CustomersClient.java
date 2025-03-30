package uk.ac.york.eng2.orders.resources;

import io.micronaut.data.model.Page;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;

import java.util.List;

@Client(CustomersController.PREFIX)
public interface CustomersClient {
    @Get
    Page<Customer> list();

    @Get("/{id}")
    Customer get(@PathVariable long id);

    @Get("/{id}/orders")
    List<Orders> listOrders(@PathVariable long id);

    @Post
    HttpResponse<Object> create(@Body CustomerCreateDTO dto);

    @Put("/{id}")
    HttpResponse<Object> update(@PathVariable long id, @Body CustomerCreateDTO dto);

    @Delete("/{id}")
    HttpResponse<Object> delete(@PathVariable long id);
}
