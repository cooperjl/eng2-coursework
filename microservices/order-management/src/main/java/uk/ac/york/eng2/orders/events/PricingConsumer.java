package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.gateways.ProductPricingInfo;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.util.Optional;

@KafkaListener(groupId = "products", threads = 3, offsetReset = OffsetReset.EARLIEST)
public class PricingConsumer {
    @Inject
    private OrdersRepository repository;

    @Transactional
    @Topic(OrdersTopicFactory.TOPIC_PRICING_INFO)
    public void pricingInfo(@KafkaKey long orderId, ProductPricingInfo info) {
        Optional<Orders> optionalOrder = repository.findById(orderId);
        if (optionalOrder.isEmpty()) {
            // order no longer exists, ignore event
            return;
        }
        Orders order = optionalOrder.get();

        order.setTotalAmount(order.getTotalAmount().add(info.totalPrices()));
        repository.update(order);
    }
}
