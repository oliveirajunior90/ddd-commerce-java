package main.java.com.commerce.domain.product;

import main.java.com.commerce.domain.validation.ValidationHandler;
import main.java.com.commerce.domain.validation.Validator;

public class ProductValidator extends Validator {

    private final Product product;

    public ProductValidator (final Product product, final ValidationHandler handler) {
        super(handler);
        this.product = product;
    }

    @Override
    public void validate() {

    }
}
