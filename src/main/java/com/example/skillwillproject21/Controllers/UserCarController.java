package com.example.skillwillproject21.Controllers;

import com.example.skillwillproject21.Models.UserCarModel;
import com.example.skillwillproject21.Request.UserRequest.UserCarRequest;
import com.example.skillwillproject21.Response.CarPurchasedResponse;
import com.example.skillwillproject21.Services.UserCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/CarShop")
@RestController
public class UserCarController {

    @Autowired
    UserCarService usercar;

    @PostMapping("/Buy")
    public CarPurchasedResponse Buy(UserCarRequest request)
    {
        return usercar.buycar(request);
    }
}
