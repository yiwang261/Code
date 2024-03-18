package com.wang.Service;

import com.wang.POJO.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> selectAll();
    int insert(Brand brand);
    int deleteById(Integer id);
}
