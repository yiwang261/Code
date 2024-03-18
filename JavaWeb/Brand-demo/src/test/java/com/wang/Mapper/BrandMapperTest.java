package com.wang.Mapper;

import com.wang.POJO.Brand;
import com.wang.Service.BrandService;
import com.wang.Service.Impl.BrandServiceImpl;
import com.wang.Utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BrandMapperTest {
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        brands.forEach(brand -> System.out.println(brand));
    }

    @Test
    public void testDeleteById(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int i =0;
        for (int j = 1; j <= 3; j++) {
             i += brandMapper.deleteById(j);
        }
        System.out.println(i);
        sqlSession.commit();
    }
    @Test
    public void testInsert(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int nums = brandMapper.insert(new Brand(23,"三只松鼠","三只松鼠",1,"好吃不上火",1));
        sqlSession.commit();
        System.out.println(nums);
    }
    @Test
    public void testService(){
        BrandService brandService = new BrandServiceImpl();
        brandService.insert(new Brand(564,"三只松鼠","三只松鼠",1,"好吃不上火",1));
    }
}
