package com.codesoom.assignment.domain;

import java.util.List;
import java.util.Optional;

/**
 * Product 저장
 */
public interface ProductRepository {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    void delete(Product product);
}
