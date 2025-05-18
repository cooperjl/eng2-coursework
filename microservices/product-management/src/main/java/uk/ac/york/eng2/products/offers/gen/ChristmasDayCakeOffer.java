package uk.ac.york.eng2.products.offers.gen;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.gen.conditions.ChristmasDayCondition;
import uk.ac.york.eng2.products.offers.gen.conditions.ChocolateCakeCondition;
import uk.ac.york.eng2.products.offers.gen.conditions.ChristmasCakePriceCondition;
import uk.ac.york.eng2.products.offers.gen.actions.ChristmasCakeDiscount;

@Singleton
public class ChristmasDayCakeOffer {
	@Inject
	private ChristmasDayCondition christmasDayCondition;
	@Inject
	private ChocolateCakeCondition chocolateCakeCondition;
	@Inject
	private ChristmasCakePriceCondition christmasCakePriceCondition;
	@Inject
	private ChristmasCakeDiscount christmasCakeDiscount;

	public ChristmasDayCakeOffer() {}

	public void applyOffer(OrderPricingDTO order) {
		boolean shouldApplyOffer = christmasDayCondition.eval(order) && chocolateCakeCondition.eval(order) && christmasCakePriceCondition.eval(order);

		if (shouldApplyOffer) {
			christmasCakeDiscount.apply(order);
		}
	}
}