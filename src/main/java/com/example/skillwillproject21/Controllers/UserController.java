package com.example.skillwillproject21.Controllers;

import com.example.skillwillproject21.Models.UserModel;
import com.example.skillwillproject21.Request.UserRequest.UserDepositRequest;
import com.example.skillwillproject21.Request.UserRequest.UserRequest;
import com.example.skillwillproject21.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/User")
@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/Register")
    public UserModel register(UserRequest userRequest)
    {
        return userService.registerUser(userRequest);
    }

    @PutMapping("/Deposit")
    public UserModel deposit(UserDepositRequest depositRequest)
    {
        return userService.Deposit(depositRequest);

    }

}
