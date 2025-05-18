package uk.ac.york.eng2.products.offers.gen.conditions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.conditions.TaggedCondition;

@Singleton
public class ChocolateCakeCondition extends TaggedCondition {
	public ChocolateCakeCondition() {
		setTagStrings(new String[] {"cake", "chocolate"});
	}
}