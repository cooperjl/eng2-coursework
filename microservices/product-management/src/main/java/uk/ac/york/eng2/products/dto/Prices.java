package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;

@Serdeable
public record Prices(BigDecimal unitPrice, BigDecimal totalPrice) {
}
