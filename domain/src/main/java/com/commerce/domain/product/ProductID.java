package com.commerce.domain.product;

import com.commerce.domain.Identifier;
import com.commerce.domain.utils.IdUtils;

import java.util.Objects;

public class ProductID extends Identifier {
    private final String value;

    private ProductID(final String value) {
        this.value = Objects.requireNonNull(value);
    }

    public static ProductID from(final String anId) {
        return new ProductID(anId.toLowerCase());
    }

    public static ProductID unique() {
        return ProductID.from(IdUtils.uuid());
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ProductID that = (ProductID) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
