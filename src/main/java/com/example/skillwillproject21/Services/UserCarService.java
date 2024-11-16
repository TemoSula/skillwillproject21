package com.example.skillwillproject21.Services;

import com.example.skillwillproject21.Models.CarModel;
import com.example.skillwillproject21.Models.UserCarModel;
import com.example.skillwillproject21.Models.UserModel;
import com.example.skillwillproject21.Repositories.CarRepository;
import com.example.skillwillproject21.Repositories.UserCarRepository;
import com.example.skillwillproject21.Repositories.UserRepository;
import com.example.skillwillproject21.Request.UserRequest.UserCarRequest;
import com.example.skillwillproject21.Response.CarPurchasedResponse;
import com.example.skillwillproject21.Response.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserCarService {

    @Autowired
    CarRepository carRepo;
    @Autowired
    UserRepository userRepo;

    @Autowired
    UserCarRepository usercarRepo;


    public CarPurchasedResponse buycar(UserCarRequest usercar)
    {
        UserModel userModel = userRepo.getUserById(usercar.getUserid());
        CarModel carModel = carRepo.getCarById(usercar.getCarId());
        if(userModel == null || carModel == null)
        {
            throw new RuntimeException("user not found");
        }
        if(!(carModel.getQuantity() > 0))
        {
            throw new RuntimeException("out of stock");
        }
        if(!(userModel.getAmount() >= carModel.getPrice()))
        {
            throw new RuntimeException("you have not enough money");
        }

        String id = UUID.randomUUID().toString();
        UserCarModel userCarModel = new UserCarModel();
        userCarModel.setId(id);
        userCarModel.setUserModel(userModel);
        userCarModel.setCarModel(carModel);
        carModel.setQuantity(carModel.getQuantity() - 1);
        userModel.setAmount(userModel.getAmount() - carModel.getPrice());
        usercarRepo.save(userCarModel);
        return ResponseMapper.mapUserCarToCarPurchase(userCarModel);


    }


}
