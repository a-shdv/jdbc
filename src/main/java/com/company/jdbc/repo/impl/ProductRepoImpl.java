package com.company.jdbc.repo.impl;

import com.company.jdbc.entity.Product;
import com.company.jdbc.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class ProductRepoImpl implements ProductRepo {

    private static final String PRODUCTS_TABLE = "products";
    private static final String SAVE_QUERY = String.format("INSERT INTO %s (id, title, description, amount) " +
            "VALUES (?, ?, ?, ?)", PRODUCTS_TABLE);
    private static final String FIND_ALL_QUERY = String.format("SELECT * FROM %s", PRODUCTS_TABLE);
    private static final String FIND_BY_ID_QUERY = String.format("SELECT * FROM %s WHERE id = ?", PRODUCTS_TABLE);
    private static final String FIND_BY_TITLE_QUERY = String.format("SELECT * FROM %s WHERE title = ?", PRODUCTS_TABLE);
    private static final String UPDATE_BY_ID_QUERY = String.format("UPDATE %s SET title = ?, description = ?, amount = ? " +
            "WHERE id = ?", PRODUCTS_TABLE);
    private static final String DELETE_ALL_QUERY = String.format("DELETE FROM %s", PRODUCTS_TABLE);
    private static final String DELETE_BY_ID_QUERY = String.format("DELETE FROM %s WHERE id = ?", PRODUCTS_TABLE);

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void save(Product product) {
        jdbcTemplate.update(SAVE_QUERY, UUID.randomUUID(), product.getTitle(), product.getDescription(), product.getAmount());
    }

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query(FIND_ALL_QUERY, BeanPropertyRowMapper.newInstance(Product.class));
    }

    @Override
    public Optional<Product> findById(UUID id) {
        Optional<Product> product = Optional.ofNullable(jdbcTemplate
                .queryForObject(FIND_BY_ID_QUERY, BeanPropertyRowMapper.newInstance(Product.class), id));
        return product;
    }

    @Override
    public Optional<Product> findByUsername(String username) {
        return Optional.empty();// TODO not implemented
    }

    @Override
    public Product updateById(UUID id, Product product) {
        return null;// TODO not implemented
    }

    @Override
    public void deleteAll() {
// TODO not implemented
    }

    @Override
    public void deleteById(UUID id) {
// TODO not implemented
    }
}
