package br.com.commerce.domain.product;

public record ProductSearchQuery(
    int page,
    int perPage,
    String terms,
    String sort
) {

}
