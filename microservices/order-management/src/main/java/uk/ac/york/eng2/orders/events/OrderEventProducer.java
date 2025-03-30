package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.orders.gateways.ProductPricingInfo;

@KafkaClient
public interface OrderEventProducer {
    @Topic(OrdersTopicFactory.TOPIC_ORDER_PLACED)
    void orderPlaced(@KafkaKey long productId, OrderInfo orderInfo);
}
