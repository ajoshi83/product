package com.solarshopee.product.api;

import com.solarshopee.product.dto.ProductDto;
import com.solarshopee.product.model.Product;
import com.solarshopee.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductApi {

    @Autowired
    private ProductService productService;
    /*@Autowired
    private RatingService ratingService;*/

    @GetMapping("/product/{productId}")
    public Product getProductInfo(@PathVariable String productId) {
        //return new ResponseEntity(productDto, HttpStatus.OK);
        return productService.getProductBySku(productId);
    }
}
