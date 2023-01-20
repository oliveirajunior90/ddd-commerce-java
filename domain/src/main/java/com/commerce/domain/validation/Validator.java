package main.java.com.commerce.domain.validation;

abstract public class Validator {

    private final ValidationHandler handler;

    protected Validator(final ValidationHandler handler) {
        this.handler = handler;
    }
    public abstract void validate();

    protected ValidationHandler validationHandler() {
        return this.handler;
    }

}
