package com.solarshopee.product.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@NoArgsConstructor
public class Product {
    @Id
    private String id;
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
