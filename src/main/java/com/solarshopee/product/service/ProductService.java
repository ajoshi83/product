package com.solarshopee.product.service;

import com.solarshopee.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductBySku(final String sku);
}
