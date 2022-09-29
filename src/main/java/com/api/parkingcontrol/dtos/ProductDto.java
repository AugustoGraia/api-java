package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public class ProductDto {

    @NotBlank
    private String nameProduct;
    @NotBlank
    private String validProduct;

    private BigDecimal valueProduct;

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
