package com.example.skillwillproject21.Request;

import com.example.skillwillproject21.Models.CarModel;
import com.example.skillwillproject21.Models.UserModel;
import com.example.skillwillproject21.Request.CarRequest.CarRequest;
import com.example.skillwillproject21.Request.UserRequest.UserRequest;

import java.util.UUID;

public class RequestMappers {

    public static UserModel mapRequestToUserModel(UserRequest userRequest)
    {
        String id = UUID.randomUUID().toString();
        UserModel userModel = new UserModel();
        userModel.setId(id);
        userModel.setFirstName(userRequest.getFirstName());
        userModel.setLastName(userRequest.getLastName());
        userModel.setAmount(userRequest.getAmount());
        return userModel;
    }

    public static CarModel mapRequestToCarModel(CarRequest carRequest)
    {
        String id = UUID.randomUUID().toString();
        CarModel carModel = new CarModel();
        carModel.setId(id);
        carModel.setCarBrand(carRequest.getCarBrand());
        carModel.setCarModel(carRequest.getCarModel());
        carModel.setQuantity(carRequest.getQuantity());
        carModel.setPrice(carRequest.getPrice());
        return carModel;
    }








}
