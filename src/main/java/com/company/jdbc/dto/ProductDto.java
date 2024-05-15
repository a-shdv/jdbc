package com.company.jdbc.dto;

import com.company.jdbc.entity.Product;

public record ProductDto(
        String title,
        String description,
        Integer amount
) {

    public ProductDto(String title, String description, Integer amount) {
        this.title = title;
        this.description = description;
        this.amount = amount;
    }

    public static Product toProduct(ProductDto dto) {
        return Product.builder()
                .title(dto.title())
                .description(dto.description())
                .amount(dto.amount())
                .build();
    }

    public static ProductDto toProductDto(Product product) {
        return new ProductDto(product.getTitle(), product.getDescription(), product.getAmount());
    }
}
