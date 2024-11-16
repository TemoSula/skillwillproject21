package com.example.skillwillproject21.Response;

public class CarPurchasedResponse {
    private String userId;
    private String fullname;
    private String carId;
    private String brandAndModel;
    private Long price;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getBrandAndModel() {
        return brandAndModel;
    }

    public void setBrandAndModel(String brandAndModel) {
        this.brandAndModel = brandAndModel;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
