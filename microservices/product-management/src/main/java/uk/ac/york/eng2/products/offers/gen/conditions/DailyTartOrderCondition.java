package uk.ac.york.eng2.products.offers.gen.conditions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.conditions.DailyOrderCondition;
import uk.ac.york.eng2.products.offers.Comparison;

@Singleton
public class DailyTartOrderCondition extends DailyOrderCondition {
	public DailyTartOrderCondition() {
		setProductString("Bakewell Tart");
		setComparison(Comparison.LESS_THAN_EQUAL);
		setThreshold(10);
	}
}