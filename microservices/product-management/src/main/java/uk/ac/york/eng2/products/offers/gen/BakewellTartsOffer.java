package uk.ac.york.eng2.products.offers.gen;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.gen.conditions.DailyTartOrderCondition;
import uk.ac.york.eng2.products.offers.gen.actions.BakewellTartsDiscount;

@Singleton
public class BakewellTartsOffer {
	@Inject
	private DailyTartOrderCondition dailyTartOrderCondition;
	@Inject
	private BakewellTartsDiscount bakewellTartsDiscount;
	@Inject
	private LargePizzasOffer largePizzasOffer;

	public BakewellTartsOffer() {}

	public void applyOffer(OrderPricingDTO order) {
		boolean shouldApplyOffer = dailyTartOrderCondition.eval(order);

		if (shouldApplyOffer) {
			bakewellTartsDiscount.apply(order);
		}

		largePizzasOffer.applyOffer(order);
	}
}