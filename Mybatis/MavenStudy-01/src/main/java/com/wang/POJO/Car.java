package com.wang.POJO;

public class Car {
    private Long id;
    private String carNum;
    private String brand;
    private Double guidePrice;
    private String produceTime;
    private String carType;
    public void Car(){}

    public Car(Long id, String carNum, String brand, Double guidePrice, String produceTime, String carType) {
        this.id = id;
        this.carNum = carNum;
        this.brand = brand;
        this.guidePrice = guidePrice;
        this.produceTime = produceTime;
        this.carType = carType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGuidePrice(Double guidePrice) {
        this.guidePrice = guidePrice;
    }

    public void setProduceTime(String produceTime) {
        this.produceTime = produceTime;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carNum='" + carNum + '\'' +
                ", brand='" + brand + '\'' +
                ", guidePrice=" + guidePrice +
                ", produceTime='" + produceTime + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }

    public String getCarNum() {
        return carNum;
    }

    public String getBrand() {
        return brand;
    }

    public Double getGuidePrice() {
        return guidePrice;
    }

    public String getProduceTime() {
        return produceTime;
    }

    public String getCarType() {
        return carType;
    }
}
