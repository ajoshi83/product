package com.solarshopee.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String sku;
    private String productName;
    private String category;
    private String subCategory;
    private String manufacturer;
    private String unitPrice;
    private String weight;
    private String colour;
    private Boolean inStock;
    private String stockQty;
    private String material;
    private Map<String,String> specificAttributes;
}
