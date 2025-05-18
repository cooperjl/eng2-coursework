package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.dto.OrderPricingCreateDTO;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;

@Client(PricingController.PREFIX)
public interface PricingClient {
    @Post
    HttpResponse<OrderPricingDTO> getPrices(@Body OrderPricingCreateDTO order);
}
