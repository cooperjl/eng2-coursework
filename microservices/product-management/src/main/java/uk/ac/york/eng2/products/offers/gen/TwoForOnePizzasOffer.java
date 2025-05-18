package uk.ac.york.eng2.products.offers.gen;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;
import uk.ac.york.eng2.products.offers.gen.conditions.OtherPizzaConditon;
import uk.ac.york.eng2.products.offers.gen.actions.TwoForOnePizzas;

@Singleton
public class TwoForOnePizzasOffer {
	@Inject
	private OtherPizzaConditon otherPizzaConditon;
	@Inject
	private TwoForOnePizzas twoForOnePizzas;
	@Inject
	private ChristmasDayDiscount christmasDayDiscount;

	public TwoForOnePizzasOffer() {}

	public void applyOffer(OrderPricingDTO order) {
		boolean shouldApplyOffer = otherPizzaConditon.eval(order);

		if (shouldApplyOffer) {
			twoForOnePizzas.apply(order);
		}

		christmasDayDiscount.applyOffer(order);
	}
}