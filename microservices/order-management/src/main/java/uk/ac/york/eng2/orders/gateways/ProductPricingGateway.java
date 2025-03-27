package uk.ac.york.eng2.orders.gateways;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.orders.product_management.api.ProductsApi;
import uk.ac.york.eng2.orders.product_management.model.Prices;

import java.util.Optional;

@Singleton
public class ProductPricingGateway {
    @Inject
    ProductsApi productsApi;

    public Optional<ProductPricingInfo> getPricingInfo(long productId, int quantity) {
        try {
            Prices prices = productsApi.getPrices(productId, quantity);
            return Optional.of(new ProductPricingInfo(prices.getUnitPrice(), prices.getTotalPrice()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }
}
