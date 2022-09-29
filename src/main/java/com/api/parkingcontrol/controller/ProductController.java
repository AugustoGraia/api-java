package com.api.parkingcontrol.controller;

import com.api.parkingcontrol.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @CrossOrigin(origins = "*", maxAge = 3600)
    public class ProductController {

        final ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @PostMapping("salve/product")
        public ResponseEntity<Object> saveProduct(){
            return
        }
    }
