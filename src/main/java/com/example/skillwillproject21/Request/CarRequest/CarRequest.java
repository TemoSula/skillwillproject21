package com.example.skillwillproject21.Request.CarRequest;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class CarRequest {
    @NotNull(message = "carBrand can't be null")
    @NotBlank(message = "carBrand can't be blank")
    private String carBrand;

    @NotNull(message = "carModel can't be null")
    @NotBlank(message = "carModel can't be blank")
    private String carModel;

    @NotNull(message = "price can't be null")
    @Min(value = 100, message = "price can't be lower then 100")
    private Long price;

    @NotNull(message = "quantity can't be null")
    @Min(value = 1, message = "quantity can't be lower then 1")
    @Max(value = 1000,message = "quantity can't be higher then 1000")
    private Integer quantity;


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
