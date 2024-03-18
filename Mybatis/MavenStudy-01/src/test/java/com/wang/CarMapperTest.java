package com.wang;

import com.wang.POJO.Car;
import com.wang.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarMapperTest {

    @Test
    public void testMax(){
        Car car = new Car(null,"1025","奔驰g级",50.0,"2019-10-01","燃油车");
        Car car2 = new Car(null,"3333","比亚迪秦1",30.00,"2022-10-10","新能源");
        for (int i = 0; i < 4; i++) {
            SqlSession sqlSession = MybatisUtils.openSession();
            sqlSession.insert("Car.insertCar",car2);
            sqlSession.commit();
        }

    }

@Test
    public void testNamespace(){
        SqlSession sqlSession = MybatisUtils.openSession();
        List<Object> cars = sqlSession.selectList("Car.selectAll");
        cars.forEach(car-> System.out.println(car));
        sqlSession.close();
    }



    //查询集合
    @Test
    public void testSelectList(){
        SqlSession sqlSession = MybatisUtils.openSession();
        List<Object> carList =  sqlSession.selectList("Car.selectAll");
        for (Object car:
             carList ) {
            System.out.println(car);
        }
        sqlSession.close();
    }


    @Test
    public void testSelect(){
            SqlSession  sqlSession= MybatisUtils.openSession();
            Object car = sqlSession.selectOne("selectCarById",1);
    //        Car car1 = (Car)car;
            System.out.println(car);

            sqlSession.commit();
            sqlSession.close();
    }

    @Test
    public void testUpdateCarById(){
        Car car = new Car(1L,"1025","奔驰g级",50.0,"2019-10-01","燃油车");
        SqlSession sqlSession = MybatisUtils.openSession();
        int cnt = sqlSession.update("updateCarById",car);
        System.out.println(cnt);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteCarById(){
        SqlSession sqlSession = MybatisUtils.openSession();
        sqlSession.delete("deleteCarById",3);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testInsertCarByPojo(){

        SqlSession sqlSession = MybatisUtils.openSession();
        Car car = new Car(null,"3333","比亚迪秦1",30.00,"2022-10-10","新能源");
        sqlSession.insert("Car.insertCar",car);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testInsertCarByUtil(){
        Map<String,Object> map = new HashMap<>();
        map.put("k1","111");
        map.put("k2","比亚迪汉");
        map.put("k3","23.0");
        map.put("k4","2020-04-10");
        map.put("k5","新能源");
       SqlSession sqlSession = MybatisUtils.openSession();
       int count = sqlSession.insert("insertCar",map);
       sqlSession.commit();
       sqlSession.close();
    }
}
