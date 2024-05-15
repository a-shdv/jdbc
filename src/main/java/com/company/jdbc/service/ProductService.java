package com.company.jdbc.service;

import com.company.jdbc.dto.ProductDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {
    ProductDto save(ProductDto productDTO); // HttpStatus.CREATED (201) or HttpStatus.BAD_REQUEST (400)
    List<ProductDto> findAll(); // HttpStatus.OK (200) or HttpStatus.NO_CONTENT (204)
    ProductDto findById(UUID id); //  HttpStatus.OK (200) or HttpStatus.NOT_FOUND (404)
    ProductDto findByTitle(String username); // HttpStatus.OK (200) or HttpStatus.NOT_FOUND (404)
    ProductDto updateById(UUID id, ProductDto productDTO); // HttpStatus.OK (200) or HttpStatus.NOT_FOUND (404) or HttpStatus.BAD_REQUEST (400)
    void deleteAll(); // HttpStatus.NO_CONTENT (204) or HttpStatus.INTERNAL_SERVER_ERROR (500)
    void deleteById(UUID id); // HttpStatus.NO_CONTENT (204) or HttpStatus.NOT_FOUND (404)
}
