package main.java.com.commerce.domain.exceptions;

public class DomainException {

    private final List<Error> errors;

    private DomainException(final List<Error> errors) {
        super("", null, true, false);
        this.errors = errors;
    }

    public static DomainException with(final List<Error> errors) {
        return new DomainException(errors);
    }

    public List<Error> getErrors() {
        return errors;
    }

}
