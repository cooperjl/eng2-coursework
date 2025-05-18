package uk.ac.york.eng2.products.offers.gen.actions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.actions.OrderDiscount;

@Singleton
public class ChristmasCakeDiscount extends OrderDiscount {
	public ChristmasCakeDiscount() {
		setPercentageDiscount(0.0);
		setPriceDiscount(5.0);
		setSetPrice(0.0);
	}
}