package uk.ac.york.eng2.orders.events;

import io.micronaut.serde.annotation.Serdeable;

import java.sql.Date;

@Serdeable
public record OrderInfo(Date day, int quantity) {
}
