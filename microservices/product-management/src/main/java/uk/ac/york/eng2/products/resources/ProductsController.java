package uk.ac.york.eng2.products.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.Prices;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.net.URI;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@io.swagger.v3.oas.annotations.tags.Tag(name = "products")
@Controller(ProductsController.PREFIX)
public class ProductsController {
    public static final String PREFIX = "/products";

    @Inject
    private ProductRepository repository;
    @Inject
    private TagRepository tagRepository;
    @Inject
    private OrdersByDayRepository ordersByDayRepository;

    @Get("/{?page}")
    public Page<Product> list(@QueryValue(defaultValue = "0") int page) {
        return repository.findAll(Pageable.from(page));
    }
    @Get("/{id}")
    public Product get(@PathVariable long id) {
        return repository.findById(id).orElse(null);
    }

    @Get("/{id}/tags")
    public List<Tag> listTags(@PathVariable long id) {
        return tagRepository.findByProductsId(id);
    }

    @Get("/{id}/daily-orders")
    public Map<Date, Integer> getDailyOrders(@PathVariable long id, @QueryValue(defaultValue = "0") int page) {
        Map<Date, Integer> stats = new HashMap<>();

        for (OrdersByDay ordersByDay : ordersByDayRepository.findByProductId(id, Pageable.from(page))) {
            stats.put(ordersByDay.getDay(), ordersByDay.getCount());
        }

        return stats;
    }

    @Get("/{id}/price/{quantity}")
    public Prices getPrices(@PathVariable long id, @PathVariable(defaultValue = "1") int quantity) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found"));

        BigDecimal unitPrice = product.getUnitPrice();

        return new Prices(unitPrice, unitPrice.multiply(BigDecimal.valueOf(quantity)));
    }

    @Post
    public HttpResponse<Object> create(@Body ProductCreateDTO dto) {
        var product = new Product();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());
        product = repository.save(product);

        return HttpResponse.created(URI.create("%s/%d".formatted(PREFIX, product.getId())));
    }

    @Transactional
    @Put("/{id}")
    public void update(@PathVariable long id, @Body ProductCreateDTO dto) {
        @NonNull Optional<Product> optionalProduct = repository.findById(id);
        if (optionalProduct.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        Product product = optionalProduct.get();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());
        repository.save(product);
    }

    @Delete("/{id}")
    public void delete(@PathVariable long id) {
        if (!repository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        repository.deleteById(id);
    }

    @Transactional
    @Put("/{id}/tags/{tagId}")
    public void addProductTag(@PathVariable long id, @PathVariable long tagId) {
        ProductTag result = getProductTag(id, tagId);
        result.product.getTags().add(result.tag);
        repository.save(result.product);
    }

    @Transactional
    @Delete("/{id}/tags/{tagId}")
    public void removeProductTag(@PathVariable long id, @PathVariable long tagId) {
        ProductTag result = getProductTag(id, tagId);
        result.product.getTags().remove(result.tag);
        repository.save(result.product);
    }

    private record ProductTag(Product product, Tag tag) {}

    private ProductTag getProductTag(long id, long tagId) {
        Tag tag = tagRepository.findById(tagId)
                .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found"));

        Product product = repository.findById(id)
                .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found"));

        return new ProductTag(product, tag);
    }

}
