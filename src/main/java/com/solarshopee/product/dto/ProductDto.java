package com.solarshopee.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String id;
    private String shortName;
    private String description;
    private String productCategory;
}
