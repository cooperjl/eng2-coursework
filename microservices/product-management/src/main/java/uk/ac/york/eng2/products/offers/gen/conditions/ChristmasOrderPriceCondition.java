package uk.ac.york.eng2.products.offers.gen.conditions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.conditions.PriceCondition;
import uk.ac.york.eng2.products.offers.Comparison;

@Singleton
public class ChristmasOrderPriceCondition extends PriceCondition {
	public ChristmasOrderPriceCondition() {
		setPrice(60.0);
		setComparison(Comparison.GREATER_THAN_EQUAL);
	}
}