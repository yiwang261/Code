package com.wang.Mapper.Impl;

import com.wang.Mapper.CarMapper;
import com.wang.POJO.Car;
import com.wang.Utils.MyUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class CarMapperImpl implements CarMapper {
    @Override
    public int Insert(Car car) {
        int cnt;
        try {
            SqlSession sqlSession = MyUtil.openSqlSession();
            cnt = sqlSession.insert("CarMapper.insertCar",car);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cnt;
    }

    @Override
    public int Update(Car car) {
        int cnt;
        try {
            SqlSession sqlSession = MyUtil.openSqlSession();
            cnt = sqlSession.update("CarMapper.updateById",car);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  cnt;

    }

    @Override
    public int DeleteById(int id) {
        int cnt;
        try {
            SqlSession sqlSession = MyUtil.openSqlSession();
            cnt = sqlSession.delete("CarMapper.deleteById",id);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cnt;
    }

    @Override
    public List<Car> QueryAll() {
        List<Car>list;
        try {
            SqlSession sqlSession = MyUtil.openSqlSession();
             list = sqlSession.selectList("CarMapper.selectAll");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public Car QueryById(int id) {
        Car car;
        try {
            SqlSession sqlSession = MyUtil.openSqlSession();
            car = sqlSession.selectOne("CarMapper.selectById",id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return car;
    }
}
