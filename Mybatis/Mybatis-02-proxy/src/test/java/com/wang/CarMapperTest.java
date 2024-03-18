package com.wang;

import com.wang.Mapper.CarMapper;
import com.wang.POJO.Car;
import com.wang.Utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CarMapperTest {
    @Test
    public void testInsertCarUserGeneratedKeys(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(null,"102","劳斯莱斯",1000.0,"2018-12-10","燃油车");
        carMapper.insertCarUserGeneratedKeys(car);

        System.out.println(car);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
    }

   @Test
   public void testInsert(){
       SqlSession sqlSession = SqlSessionUtil.openSession();
       CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
       Car car = new Car(null,"102","劳斯莱斯",1000.0,"2018-12-10","燃油车");
       carMapper.insert(car);
       sqlSession.commit();

    }
    @Test
    public void testSelect(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        Car car = carMapper.selectById(146L);
        System.out.println(car);
    }
    @Test
    public void testUpdate(){
        Car car = new Car(146L,"102","aaa",1000.0,"2018-12-10","燃油车aaa");
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        int cnt = carMapper.update(car);
        sqlSession.commit();
        System.out.println(cnt);

    }
    @Test
    public void testSelecAll(){
        List<Car> cars = new ArrayList<>();
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);

       cars =  carMapper.selectAll();
        for (Car car :
                cars) {
            System.out.println(car);
        }

    }
    @Test
    public void testDeleteById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        int cnt = mapper.deleteById(1L);
        sqlSession.commit();
        System.out.println(cnt);
    }
}
