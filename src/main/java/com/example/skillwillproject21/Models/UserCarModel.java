package com.example.skillwillproject21.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "usercars")
public class UserCarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name = "car_id")
    CarModel carModel;
    @ManyToOne
    @JoinColumn(name = "user_id")
    UserModel userModel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
