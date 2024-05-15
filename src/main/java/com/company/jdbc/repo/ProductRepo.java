package com.company.jdbc.repo;

import com.company.jdbc.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepo {
    void save(Product product);
    List<Product> findAll();
    Optional<Product> findById(UUID id);
    Optional<Product> findByUsername(String username);
    Product updateById(UUID id, Product product);
    void deleteAll();
    void deleteById(UUID id);
}
