package com.example.skillwillproject21.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "cars")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    //@NotNull(message = "carBrand can't be null")
    @Column(name = "car_brand")
    private String carBrand;
    //@NotNull(message = "carModel can't be null")
    @Column(name = "car_model")
    private String carModel;
    //@NotNull(message = "price can't be null")
    //@Min(value = 100, message = "price can't be lower then 100")
    @Column(name = "price")
    private Long price;
    //@NotNull(message = "carBrand can't be null")
    //@Length(min = 1,max = 1000,message = "quantity will be only 1-1000")
    @Column(name = "quantity")
    private int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
