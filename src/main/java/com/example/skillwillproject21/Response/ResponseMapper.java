package com.example.skillwillproject21.Response;

import com.example.skillwillproject21.Models.UserCarModel;

public class ResponseMapper {


    public static CarPurchasedResponse mapUserCarToCarPurchase(UserCarModel userCarModel)
    {
        CarPurchasedResponse cpr = new CarPurchasedResponse();
        cpr.setFullname(userCarModel.getUserModel().getFirstName() + " " + userCarModel.getUserModel().getLastName());
        cpr.setUserId(userCarModel.getUserModel().getId());
        cpr.setCarId(userCarModel.getCarModel().getId());
        cpr.setBrandAndModel(userCarModel.getCarModel().getCarBrand() + " " + userCarModel.getCarModel().getCarModel());
        cpr.setPrice(userCarModel.getCarModel().getPrice());
        return cpr;
    }

}
