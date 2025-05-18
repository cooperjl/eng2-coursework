package uk.ac.york.eng2.products.offers.gen.actions;

import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.offers.actions.ProductDiscount;

@Singleton
public class BakewellTartsDiscount extends ProductDiscount {
	public BakewellTartsDiscount() {
		setPercentageDiscount(10.0);
		setPriceDiscount(0.0);
		setSetPrice(0.0);
		setQuantityDiscount(0);
		setProductString("Bakewell Tart");
	}
}