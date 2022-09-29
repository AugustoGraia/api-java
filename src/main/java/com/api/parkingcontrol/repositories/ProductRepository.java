package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductModel, UUID>  {

}
