package uk.ac.york.eng2.products.offers.gen.conditions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.conditions.TaggedCondition;

@Singleton
public class LargePizzaCondition extends TaggedCondition {
	public LargePizzaCondition() {
		setTagStrings(new String[] {"large", "pizza"});
	}
}