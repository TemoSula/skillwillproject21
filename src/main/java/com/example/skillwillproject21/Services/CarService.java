package com.example.skillwillproject21.Services;

import com.example.skillwillproject21.Models.CarModel;
import com.example.skillwillproject21.Repositories.CarRepository;
import com.example.skillwillproject21.Request.CarRequest.CarChangeOptionsRequest;
import com.example.skillwillproject21.Request.CarRequest.CarRequest;
import com.example.skillwillproject21.Request.RequestMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepository carRepo;

    public CarModel AddCars(CarRequest carRequest){

        CarModel carModel = RequestMappers.mapRequestToCarModel(carRequest);
        return carRepo.save(carModel);

    }


    public Page<CarModel> getAllCars(int page)
    {
        return carRepo.getAllCars(PageRequest.of(page,10));
    }

    public Page<CarModel> getCarsByBrands(String brandName, int page)
    {
        return carRepo.getBrandCars(brandName,PageRequest.of(page,10));
    }

    public CarModel fillCarsQuantity(CarChangeOptionsRequest carRequest)
    {
        CarModel carModel = carRepo.getCarById(carRequest.getId());
        if(carModel == null)
        {
            throw new RuntimeException("car not found");
        }
        carModel.setCarModel(carModel.getCarModel());
        carModel.setCarBrand(carModel.getCarBrand());
        carModel.setPrice(carRequest.getPrice());
        carModel.setQuantity(carRequest.getQuantity());

        return carRepo.save(carModel);
    }



}


