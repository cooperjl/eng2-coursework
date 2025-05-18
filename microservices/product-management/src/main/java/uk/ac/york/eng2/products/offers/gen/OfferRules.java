package uk.ac.york.eng2.products.offers.gen;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;

@Singleton
public class OfferRules {
	@Inject
	private BakewellTartsOffer bakewellTartsOffer;

	public OfferRules() {}

	public OrderPricingDTO applyOfferRules(OrderPricingDTO order) {
		bakewellTartsOffer.applyOffer(order);
		return order;
	}
}