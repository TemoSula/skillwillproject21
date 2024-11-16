package com.example.skillwillproject21.Repositories;

import com.example.skillwillproject21.Models.CarModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel, String> {

    @Query("select ca from CarModel ca where ca.id = :carId")
    CarModel getCarById(@Param("carId") String carId);

    @Query("select ca from CarModel ca")
    Page<CarModel> getAllCars(Pageable pageable);

    @Query("Select ca from CarModel ca where ca.carBrand = :brandName")
    Page<CarModel> getBrandCars(@Param("brandName") String brandName,Pageable pageable);
}
