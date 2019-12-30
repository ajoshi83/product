package com.solarshopee.product.service.impl;

import com.solarshopee.product.model.Product;
import com.solarshopee.product.repository.ProductRepository;
import com.solarshopee.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductBySku(String sku) {
        return productRepository.findBySku(sku);
    }
}
