package com.wang.Mapper;

import com.wang.POJO.Car;

import java.util.List;

public interface CarMapper {
    int Insert(Car car);
    int Update(Car car);
    int DeleteById(int id);
    List<Car> QueryAll();
    Car QueryById(int id);
}
