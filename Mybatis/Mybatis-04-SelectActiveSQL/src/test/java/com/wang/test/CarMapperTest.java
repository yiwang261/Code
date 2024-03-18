package com.wang.test;

import com.wang.Mapper.CarMapper;
import com.wang.Pojo.Car;
import com.wang.Utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarMapperTest {
    @Test
    public void testDeleteBachWithOr(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Long []ids = {151L, 152L};

        int cout = mapper.deleteBachWithOr(ids);
        System.out.println(cout);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testInsertBach(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car1 = new Car(null, "111", "马自达", 21.11, "2014-11-11", "燃油车");
        Car car2 = new Car(null, "222", "BYD", 11.11,"2014-11-11", "燃油车");
        Car car3 = new Car(null, "333", "马自达", 21.11, "2014-11-11", "燃油车");
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        mapper.insertBach(cars);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDeleteByIds(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Long []ids = {148L,149L, 150L};
        int cnt = mapper.DeleteByIds(ids);
        System.out.println(cnt);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testSelectByChoose(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectByChoose("比亚迪", null, null);
        cars.forEach(car -> System.out.println(car));
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(147L, null, null ,null, null, null);
        mapper.Update(car);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testUpdateBySet(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(147L, null, "摇摇车" ,null, null, null);
        mapper.UpdateBySet(car);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectByManyParam(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car>cars = mapper.selectByManyParam("比亚迪",null,null);
        cars.forEach(car ->{
            System.out.println(car);
        });
        sqlSession.close();
    }
    @Test
    public void testSelectAllResultMap(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
       List<Car> cars =  mapper.selectAllByResultMap();
        for (Car car :
                cars) {
            System.out.println(car);
        }
    }

    @Test
    public void testSelectAllRetMap(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Map<Long, Map<String, Object>> map = mapper.selectAllRetMap();
        System.out.println(map);
    }
    @Test
    public void testSelectByMap(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List< Map<String, Object>> map = mapper.selectAllByMap();
        map.forEach(car -> System.out.println(car));
    }

    @Test
    public void testSelectAll(){

        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectAll();
        cars.forEach(car -> System.out.println(car));
        sqlSession.close();
    }
    @Test
    public void testSelectById(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = mapper.selectById(147L);
        System.out.println(car);
        sqlSession.close();
    }
}
