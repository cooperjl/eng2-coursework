package uk.ac.york.eng2.products.offers.gen.actions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.actions.OrderDiscount;

@Singleton
public class ChristmasOrderDiscount extends OrderDiscount {
	public ChristmasOrderDiscount() {
		setPercentageDiscount(10.0);
		setPriceDiscount(0.0);
		setSetPrice(0.0);
	}
}