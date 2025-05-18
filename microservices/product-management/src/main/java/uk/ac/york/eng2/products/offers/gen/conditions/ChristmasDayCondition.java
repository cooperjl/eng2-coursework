package uk.ac.york.eng2.products.offers.gen.conditions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.conditions.DateRangeCondition;

@Singleton
public class ChristmasDayCondition extends DateRangeCondition {
	public ChristmasDayCondition() {
		setStartDate("Thu Dec 25 00:00:00 GMT 2025");
		setEndDate("Fri Dec 26 00:00:00 GMT 2025");
	}
}