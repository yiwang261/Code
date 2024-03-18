package com.wang;

import com.wang.Mapper.CarMapper;
import com.wang.Mapper.Impl.CarMapperImpl;
import com.wang.POJO.Car;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CarMapperTest1 {
    private static CarMapper carMapper = new CarMapperImpl();

    @Test
    public void testInsert(){
        int cnt=0;
        Car car = new Car(null,"2541","劳斯莱斯",200.0,"2023-10-01","燃油车");
        for (int i = 50; i <=100 ; i++) {
            cnt += carMapper.Insert(car);
        }

        System.out.println(cnt);
    }
    @Test
    public void testQueryAll(){
        List<Car> cars ;
       cars =  carMapper.QueryAll();
        Iterator<Car> iterator = cars.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void testQueryById(){
        Car car;
        car = carMapper.QueryById(1);
        System.out.println(car);
    }
    @Test
    public void testUpdateById(){
        Car car = new Car(1L,"2541","劳斯莱斯",200.0,"2023-10-01","燃油车");
        int cnt = carMapper.Update(car);
        System.out.println(cnt);
    }
    @Test
    public void testDeleteById(){
        int cnt=0;
        for (int i = 42 ;i <= 49 ; i++) {
            cnt += carMapper.DeleteById(i);
        }
//        cnt += carMapper.DeleteById(1);
        System.out.println(cnt);
    }

}
