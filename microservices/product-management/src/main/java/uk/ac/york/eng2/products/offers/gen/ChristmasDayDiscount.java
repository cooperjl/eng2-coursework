package uk.ac.york.eng2.products.offers.gen;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.gen.conditions.ChristmasDayCondition;
import uk.ac.york.eng2.products.offers.gen.conditions.ChristmasOrderPriceCondition;
import uk.ac.york.eng2.products.offers.gen.actions.ChristmasOrderDiscount;

@Singleton
public class ChristmasDayDiscount {
	@Inject
	private ChristmasDayCondition christmasDayCondition;
	@Inject
	private ChristmasOrderPriceCondition christmasOrderPriceCondition;
	@Inject
	private ChristmasOrderDiscount christmasOrderDiscount;
	@Inject
	private ChristmasDayCakeOffer christmasDayCakeOffer;

	public ChristmasDayDiscount() {}

	public void applyOffer(OrderPricingDTO order) {
		boolean shouldApplyOffer = christmasDayCondition.eval(order) && christmasOrderPriceCondition.eval(order);

		if (shouldApplyOffer) {
			christmasOrderDiscount.apply(order);
		} else {
			christmasDayCakeOffer.applyOffer(order);
		}
	}
}