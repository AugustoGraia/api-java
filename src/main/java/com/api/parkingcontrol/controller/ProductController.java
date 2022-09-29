package com.api.parkingcontrol.controller;

import com.api.parkingcontrol.dtos.ProductDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.models.ProductModel;
import com.api.parkingcontrol.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
    @CrossOrigin(origins = "*", maxAge = 3600)
    public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("salve/product")
    public ResponseEntity<Object> saveProduct(@RequestBody @Valid ProductDto productDto) {

        var productModel = new ProductModel();
        BeanUtils.copyProperties(productDto, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(productModel));
    }
    @GetMapping("list-product")
    public ResponseEntity<List<ProductModel>> listarTodosProdutos() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.listProduct());
    }
    @GetMapping("lista-por-id/{id}")
    public ResponseEntity<Object> listarPorId(@PathVariable(value = "id") UUID id) {
        Optional<ProductModel> productModelOptional = productService.buscaPorId(id);
    if (!productModelOptional.isPresent()){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não existente");
    }
    return ResponseEntity.status(HttpStatus.OK).body(productModelOptional.get());
    }

}