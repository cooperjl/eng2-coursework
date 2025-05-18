package uk.ac.york.eng2.products.offers.gen.actions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.actions.TaggedDiscount;

@Singleton
public class TwoForOnePizzas extends TaggedDiscount {
	public TwoForOnePizzas() {
		setPercentageDiscount(0.0);
		setPriceDiscount(0.0);
		setSetPrice(0.0);
		setQuantityDiscount(1);
		setTagStrings(new String[] {"pizza"});
	}
}