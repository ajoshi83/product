package com.solarshopee.product.api;

import com.solarshopee.product.dto.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductInfo {

    @GetMapping("/product/{productId}")
    public ResponseEntity<ProductDto> getProductInfo(@PathVariable String productId) {
        if(productId.equalsIgnoreCase("QX5252F")) {
            ProductDto productDto = new ProductDto("P1","QX5252F","LED Driver with auto Dusk/Dawn On/Off","LED Driver");
            return new ResponseEntity(productDto, HttpStatus.OK);
        } else {
            return new ResponseEntity("Invalid product code", HttpStatus.BAD_REQUEST);
        }
    }
}
