package com.company.jdbc.service.impl;

import com.company.jdbc.dto.ProductDto;
import com.company.jdbc.entity.Product;
import com.company.jdbc.exception.ProductNotFoundException;
import com.company.jdbc.repo.ProductRepo;
import com.company.jdbc.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    @Override
    public ProductDto save(ProductDto dto) {
        productRepo.save(ProductDto.toProduct(dto));
        return dto;
    }

    @Override
    public List<ProductDto> findAll() {
        List<Product> products = productRepo.findAll();
        return products.stream().map(ProductDto::toProductDto).toList();
    }

    @Override
    public ProductDto findById(UUID id) {
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product with id %s not found".formatted(id)));
        return ProductDto.toProductDto(product);
    }

    @Override
    public ProductDto findByTitle(String title) {
        return null;// TODO not implemented
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
