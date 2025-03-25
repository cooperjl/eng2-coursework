package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.util.Optional;

@KafkaListener(groupId = "orders", threads = 3, offsetReset = OffsetReset.EARLIEST)
public class OrderConsumer {
    @Inject
    private OrdersByDayRepository repository;

    @Inject
    private ProductRepository productRepository;

    @Transactional
    @Topic("order-placed")
    public void orderPlaced(@KafkaKey long productId, OrderInfo orderInfo) {
        OrdersByDay ordersByDay;
        Optional<OrdersByDay> optionalOrdersByDay = repository.findByProductIdAndDay(productId, orderInfo.day());
        if (optionalOrdersByDay.isEmpty()) {
            Product product = productRepository.findById(productId)
                    .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found"));
            ordersByDay = new OrdersByDay(product, orderInfo.day());
        } else {
            ordersByDay = optionalOrdersByDay.get();
        }
        ordersByDay.setCount(ordersByDay.getCount() + orderInfo.quantity());
        repository.save(ordersByDay);
    }
}
