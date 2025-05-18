package uk.ac.york.eng2.products.offers.gen;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.gen.conditions.LargePizzaCondition;
import uk.ac.york.eng2.products.offers.gen.actions.FreeLargeIceCream;
import uk.ac.york.eng2.products.offers.gen.actions.LargePizzasDiscount;

@Singleton
public class LargePizzasOffer {
	@Inject
	private LargePizzaCondition largePizzaCondition;
	@Inject
	private FreeLargeIceCream freeLargeIceCream;
	@Inject
	private LargePizzasDiscount largePizzasDiscount;
	@Inject
	private ChristmasDayDiscount christmasDayDiscount;
	@Inject
	private TwoForOnePizzasOffer twoForOnePizzasOffer;

	public LargePizzasOffer() {}

	public void applyOffer(OrderPricingDTO order) {
		boolean shouldApplyOffer = largePizzaCondition.eval(order);

		if (shouldApplyOffer) {
			freeLargeIceCream.apply(order);
			largePizzasDiscount.apply(order);

			christmasDayDiscount.applyOffer(order);
		} else {
			twoForOnePizzasOffer.applyOffer(order);
		}
	}
}