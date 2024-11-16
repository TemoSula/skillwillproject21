package com.example.skillwillproject21.Controllers;

import com.example.skillwillproject21.Models.CarModel;
import com.example.skillwillproject21.Request.CarRequest.CarChangeOptionsRequest;
import com.example.skillwillproject21.Request.CarRequest.CarRequest;
import com.example.skillwillproject21.Services.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Car")
@RestController
public class CarController {

    @Autowired
    CarService carService;


    @PostMapping("/Add")
    public CarModel addCar(@RequestBody @Valid CarRequest carRequest)
    {
        return carService.AddCars(carRequest);
    }

    @GetMapping("/Get")
    public Page<CarModel> GetAllCars(@RequestParam int page)
    {
        return carService.getAllCars(page);
    }

    @PutMapping("/ChangeOptions")
    public CarModel fillCarThings(@RequestBody CarChangeOptionsRequest carrequest)
    {
        return carService.fillCarsQuantity(carrequest);
    }

    @GetMapping("/Brands")
    public Page<CarModel> getByBrands(String brandName, int page)
    {
        return carService.getCarsByBrands(brandName,page);
    }

}
