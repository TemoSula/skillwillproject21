package com.example.skillwillproject21.Services;

import com.example.skillwillproject21.Models.UserModel;
import com.example.skillwillproject21.Repositories.UserRepository;
import com.example.skillwillproject21.Request.RequestMappers;
import com.example.skillwillproject21.Request.UserRequest.UserDepositRequest;
import com.example.skillwillproject21.Request.UserRequest.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public UserModel registerUser(UserRequest userModel)
    {
     UserModel userModel1 = RequestMappers.mapRequestToUserModel(userModel);
     return userRepo.save(userModel1);
    }

    public Page<UserModel> getAllUser(int page)
    {
        return userRepo.getAllUser(PageRequest.of(page,10));
    }

    public UserModel Deposit(UserDepositRequest depositRequest)
    {
        UserModel userModel = userRepo.getUserById(depositRequest.getId());
        if(userModel == null)
        {
            throw new RuntimeException("user not found");
        }

        userModel.setAmount(depositRequest.getAmount());
        userModel.setFirstName(userModel.getFirstName());
        userModel.setLastName(userModel.getLastName());
        userRepo.save(userModel);
        return userModel;
    }

}
