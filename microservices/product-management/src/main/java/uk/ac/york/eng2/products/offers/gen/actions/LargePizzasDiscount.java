package uk.ac.york.eng2.products.offers.gen.actions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.actions.TaggedDiscount;

@Singleton
public class LargePizzasDiscount extends TaggedDiscount {
	public LargePizzasDiscount() {
		setPercentageDiscount(0.0);
		setPriceDiscount(0.0);
		setSetPrice(10.0);
		setQuantityDiscount(1);
		setTagStrings(new String[] {"large", "pizza"});
	}
}