package br.com.commerce.domain.product;

import br.com.commerce.domain.utils.InstantUtils;
import br.com.commerce.domain.validation.ValidationHandler;
import br.com.commerce.domain.product.ProductID;
import br.com.commerce.domain.AggregateRoot;

import java.time.Instant;

public class Product extends AggregateRoot<ProductID> {

    private String name;
    private Double price;
    private Instant createdAt;

    private Instant updatedAt;

    protected Product(ProductID id, String name, Double price, Instant createdAt, Instant updatedAt) {
        super(id);
        this.name = name;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static Product newProduct(String name, Double price) {
        final var now = InstantUtils.now();
        final var id = ProductID.unique();
        return new Product(id, name, price, now, now);
    }

    @Override
    public void validate(final ValidationHandler handler) {
        new ProductValidator(this, handler).validate();
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changePrice(Double price) {
        this.price = price;
    }
}
