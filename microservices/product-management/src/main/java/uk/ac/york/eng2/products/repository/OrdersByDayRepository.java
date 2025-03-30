package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.OrdersByDay;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrdersByDayRepository extends PageableRepository<OrdersByDay, Long> {
    Optional<OrdersByDay> findByProductIdAndDay(long productId, Date day);
    List<OrdersByDay> findByProductId(long productId, Pageable pageable);
}
