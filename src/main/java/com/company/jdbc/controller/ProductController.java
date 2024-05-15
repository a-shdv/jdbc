package com.company.jdbc.controller;

import com.company.jdbc.dto.ProductDto;
import com.company.jdbc.exception.ProductNotFoundException;
import com.company.jdbc.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> save(@RequestBody ProductDto dto) {
        productService.save(dto);
        return new ResponseEntity<  >(dto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> findAll() {
        List<ProductDto> dtos = productService.findAll();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable UUID id) {
//        try {
//            ProductDto dto = productService.findById(id);
//            return new ResponseEntity<>(dto, HttpStatus.OK);
//        } catch (ProductNotFoundException e) {
//            return new ResponseEntity<>(dto, HttpStatus.NotF);
//        }
        return null;
    }
}
