package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.repository.PageableRepository;
import io.micronaut.http.annotation.PathVariable;
import uk.ac.york.eng2.orders.domain.Orders;

@Repository
public interface OrdersRepository extends PageableRepository<Orders, Long> {
    Page<Orders> findByCustomerId(@PathVariable long id, Pageable pageable);
}
