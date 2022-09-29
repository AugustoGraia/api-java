package com.api.parkingcontrol.controller;

import com.api.parkingcontrol.dtos.ProductDto;
import com.api.parkingcontrol.models.ProductModel;
import com.api.parkingcontrol.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

        @GetMapping("list-product")
        public ResponseEntity<List<ProductModel>> listarTodosProdutos(){
            return ResponseEntity.status(HttpStatus.OK).body(productService.listProduct());
        }
    }
