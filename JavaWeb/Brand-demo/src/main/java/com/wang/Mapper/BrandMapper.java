package com.wang.Mapper;

import com.wang.POJO.Brand;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();
    int insert(Brand brand);
    int deleteById(Integer id);
}
