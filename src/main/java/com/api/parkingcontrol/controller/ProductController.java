package com.api.parkingcontrol.controller;

import com.api.parkingcontrol.dtos.ProductDto;
import com.api.parkingcontrol.models.ProductModel;
import com.api.parkingcontrol.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

    @RestController
    @CrossOrigin(origins = "*", maxAge = 3600)
    public class ProductController {

        final ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @PostMapping("salve/product")
        public ResponseEntity<Object> saveProduct(@RequestBody @Valid ProductDto productDto){

            var productModel = new ProductModel();
            BeanUtils.copyProperties(productDto, productModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(productModel));
        }
    }
