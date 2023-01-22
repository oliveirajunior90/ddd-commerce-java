package br.com.commerce.domain.validation;

import java.util.List;

public interface ValidationHandler {

    public interface Validation {
        void validate();
    }

    ValidationHandler append(Error error);

    ValidationHandler append(ValidationHandler handler);

    ValidationHandler validate(Validation validation);

    List<Error> getErrors();

    default boolean hasError() {
        return getErrors() != null && !getErrors().isEmpty();
    }
}
