package uk.ac.york.eng2.orders.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.net.URI;

@Tag(name = "customers")
@Controller(CustomersController.PREFIX)
public class CustomersController {
    public static final String PREFIX = "/customers";

    @Inject
    private CustomerRepository repository;
    @Inject
    private OrdersRepository ordersRepository;

    private Customer dtoToCustomer(CustomerCreateDTO dto, Customer customer) {
        customer.setEmail(dto.getEmail());
        customer.setFirstName(dto.getFirstName());
        customer.setFamilyName(dto.getFamilyName());

        customer = repository.save(customer);
        return customer;
    }

    @Get("/{?page}")
    public Page<Customer> list(@QueryValue(defaultValue = "0") int page) {
        return repository.findAll(Pageable.from(page));
    }

    @Get("/{id}")
    public Customer get(@PathVariable long id) {
        return repository.findById(id).orElse(null);
    }

    @Get("/{id}/orders")
    public Page<Orders> getOrders(@PathVariable long id, @QueryValue(defaultValue = "0") int page) {
        return ordersRepository.findByCustomerId(id, Pageable.from(page));
    }

    @Post
    public HttpResponse<Object> create(@Body CustomerCreateDTO dto) {
        Customer customer = new Customer();
        customer = dtoToCustomer(dto, customer);

        return HttpResponse.created(URI.create("%s/%d".formatted(PREFIX, customer.getId())));
    }

    @Transactional
    @Put("/{id}")
    public void update(@PathVariable long id, @Body CustomerCreateDTO dto) {
        @NonNull Customer customer = repository.findById(id)
                .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found"));

        dtoToCustomer(dto, customer);
    }

    @Delete("/{id}")
    public void delete(@PathVariable long id) {
        if (!repository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
        repository.deleteById(id);
    }
}
