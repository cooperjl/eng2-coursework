package uk.ac.york.eng2.orders.resources;

import io.micronaut.data.model.Page;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;

@Client(OrdersController.PREFIX)
public interface OrdersClient {
    @Get
    Page<Orders> list();

    @Get("/{id}")
    Orders get(@PathVariable long id);

    @Get("/{id}/customer")
    Customer getCustomer(@PathVariable long id);

    @Get("/{id}/items")
    Page<OrderItem> listItems(@PathVariable long id);

    @Post
    HttpResponse<Object> create(@Body OrderCreateDTO dto);

    @Put("/{id}")
    HttpResponse<Object> update(@PathVariable long id, @Body OrderCreateDTO dto);

    @Put("/{id}/delivered")
    HttpResponse<Object> updateDelivered(@PathVariable long id, @Body boolean delivered);

    @Put("/{id}/paid")
    HttpResponse<Object> updatePaid(@PathVariable long id, @Body boolean paid);

    @Delete("/{id}")
    HttpResponse<Object> delete(@PathVariable long id);
}
