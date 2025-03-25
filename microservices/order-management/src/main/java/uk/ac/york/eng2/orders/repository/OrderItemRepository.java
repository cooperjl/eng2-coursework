package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.http.annotation.PathVariable;
import uk.ac.york.eng2.orders.domain.OrderItem;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {
    Page<OrderItem> findByOrderId(@PathVariable long id, Pageable pageable);
}
