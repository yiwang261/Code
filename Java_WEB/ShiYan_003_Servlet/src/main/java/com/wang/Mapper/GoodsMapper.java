package com.wang.Mapper;

import com.wang.Bean.Goods;

import java.util.List;

public interface GoodsMapper {
    List<Goods> SelectAll();
    int deleteById(Integer id);
    Goods findById(Integer id);
}
