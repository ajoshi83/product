package com.solarshopee.product.repository;

import com.solarshopee.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductRepository extends MongoRepository<Product, String> {
    @Query("{'sku':?0}")
    Product findBySku(final String sku);
}
