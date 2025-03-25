package uk.ac.york.eng2.orders.gateways;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;

@Serdeable
public record ProductPricingInfo(BigDecimal unitPrices, BigDecimal totalPrices) {
}
