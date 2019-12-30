package com.solarshopee.product.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.solarshopee.product.model.Product;
import com.solarshopee.product.service.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final ProductService productService;

    public List<Product> allProducts() {
        return productService.getAllProducts();
    }

    public Product productBySku(String sku) {
        return productService.getProductBySku(sku);
    }
}
