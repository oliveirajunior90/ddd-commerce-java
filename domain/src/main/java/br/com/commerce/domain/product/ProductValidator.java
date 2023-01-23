package br.com.commerce.domain.product;

import br.com.commerce.domain.validation.Error;
import br.com.commerce.domain.validation.ValidationHandler;
import br.com.commerce.domain.validation.Validator;

public class ProductValidator extends Validator {

    private final Product product;

    public ProductValidator (final Product product, final ValidationHandler handler) {
        super(handler);
        this.product = product;
    }

    @Override
    public void validate() {
        if(this.product.getName() == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }

        if(this.product.getName().isEmpty()) {
            this.validationHandler().append(new Error("'name' should not be empty"));
        }

        if(this.product.getName().length() > 4) {
            this.validationHandler().append(new Error("'name' has to more than four characters"));
        }
    }
}
