package com.company.jdbc.service.impl;

import com.company.jdbc.dto.ProductDto;
import com.company.jdbc.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductDto save(ProductDto productDTO) {
        return null;// TODO not implemented
    }

    @Override
    public List<ProductDto> findAll() {
        return null;// TODO not implemented
    }

    @Override
    public Optional<ProductDto> findById(UUID id) {
        return Optional.empty();// TODO not implemented
    }

    @Override
    public Optional<ProductDto> findByUsername(String username) {
        return Optional.empty();// TODO not implemented
    }

    @Override
    public ProductDto updateById(UUID id, ProductDto productDTO) {
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
