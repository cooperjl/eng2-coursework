package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import io.micronaut.http.annotation.PathVariable;
import uk.ac.york.eng2.orders.domain.Customer;

import java.util.Optional;

@Repository
public interface CustomerRepository extends PageableRepository<Customer, Long> {
    Optional<Customer> findByOrdersId(@PathVariable long id);
}
