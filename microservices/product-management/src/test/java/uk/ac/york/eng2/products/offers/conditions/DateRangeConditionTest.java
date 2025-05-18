package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.BaseOfferTest;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(transactional = false)
public class DateRangeConditionTest extends BaseOfferTest {
    @Inject
    private DateRangeCondition dateRangeCondition;

    @Test
    public void evalDateRangeCondition() {
        OrderPricingDTO order = createDTO("Pizza");

        dateRangeCondition.setStartDate("Wrong formatted string");
        dateRangeCondition.setEndDate("Wrong formatted string");
        assertFalse(dateRangeCondition.eval(order));

        dateRangeCondition.setStartDate("Wed Jan 1 00:00:00 GMT 2025");
        dateRangeCondition.setEndDate("Thu Jan 2 00:00:00 GMT 2025");

        // Unix timestamp which corresponds to 2025-01-01 08:00:00
        Date validDay = new Date(1735718400000L);

        assertFalse(dateRangeCondition.eval(order));

        order.setDateCreated(validDay);
        assertTrue(dateRangeCondition.eval(order));
    }
}
