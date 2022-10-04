package com.api.parkingcontrol.models;


import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "ProductModel")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 50)
    private String nameProduct;

    @Column(nullable = false, unique = false, length = 80)
    private String validProduct;

    @Column(nullable = false)
    private BigDecimal valueProduct;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getValidProduct() {
        return validProduct;
    }

    public void setValidProduct(String validProduct) {
        this.validProduct = validProduct;
    }

    public BigDecimal getValueProduct() {
        return valueProduct;
    }

    public void setValueProduct(BigDecimal valueProduct) {
        this.valueProduct = valueProduct;
    }

}
