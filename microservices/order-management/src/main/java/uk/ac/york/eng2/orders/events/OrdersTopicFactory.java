package uk.ac.york.eng2.orders.events;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class OrdersTopicFactory {
    public static final String TOPIC_ORDER_PLACED = "order-placed";
    public static final String TOPIC_PRICING_INFO = "pricing-info";

    @Bean
    public NewTopic ordersTopic() {
        return new NewTopic(TOPIC_ORDER_PLACED, 3, (short) 1);
    }

    @Bean
    public NewTopic pricingInfoTopic() {
        return new NewTopic(TOPIC_PRICING_INFO, 3, (short) 1);
    }
}
