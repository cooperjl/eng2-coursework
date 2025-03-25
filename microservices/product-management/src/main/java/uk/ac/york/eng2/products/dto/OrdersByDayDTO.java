package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.HashMap;
import java.util.Map;

@Serdeable
public class OrdersByDayDTO {
    private Map<Long, Integer> stat;

    public OrdersByDayDTO() {
        this.stat = new HashMap<>();
    }

    public Map<Long, Integer> getStat() {
        return stat;
    }

    public void setStat(long productId, int count) {
        stat.put(productId, count);
    }
}
