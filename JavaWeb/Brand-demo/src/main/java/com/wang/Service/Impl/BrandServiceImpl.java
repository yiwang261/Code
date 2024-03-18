package com.wang.Service.Impl;

import com.wang.Mapper.BrandMapper;
import com.wang.POJO.Brand;
import com.wang.Service.BrandService;
import com.wang.Utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BrandServiceImpl implements BrandService {
    @Override
    public List<Brand> selectAll() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        return brands;
    }

    @Override
    public int insert(Brand brand) {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int insert = mapper.insert(brand);
        sqlSession.commit();

        return insert;
    }

    @Override
    public int deleteById(Integer id) {
        SqlSession sqlSession =SqlSessionUtil.openSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int i = mapper.deleteById(id);
        return i;
    }


}
