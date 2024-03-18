package com.wang.Mapper;

import com.wang.POJO.Car;

import java.util.List;

public interface CarMapper {
    int insertCarUserGeneratedKeys(Car car);
    int deleteBatch(Long ids);
    int insert(Car car);
    int update(Car car);
    int deleteById(Long id);
    List<Car> selectAll();
    Car selectById(Long id);

}
