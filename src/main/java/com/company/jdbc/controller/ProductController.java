package com.company.jdbc.controller;

import com.company.jdbc.dto.ProductDto;
import com.company.jdbc.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> save(@RequestBody ProductDto dto) {
        // TODO not implemented
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
