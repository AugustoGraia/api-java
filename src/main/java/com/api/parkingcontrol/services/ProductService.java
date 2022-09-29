package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ProductModel;
import com.api.parkingcontrol.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProductService {

    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public ProductModel save(ProductModel productModel){
        return ProductRepository.save(productModel);
    }
}
