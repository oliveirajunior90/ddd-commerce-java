package br.com.commerce.domain.product;

import br.com.commerce.domain.pagination.Pagination;

import java.util.List;
import java.util.Optional;

public interface ProductGateway {

    Product create(Product aProduct);

    void deleteById(ProductID anId);

    Optional<Product> findById(ProductID anId);

    Product update(Product aProduct);

    Pagination<Product> findAll(ProductSearchQuery aQuery);

    List<ProductID> existsByIds(Iterable<ProductID> ids);
}
