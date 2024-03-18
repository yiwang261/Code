package wang.mapper;



import wang.pojo.Car;

import java.util.List;

public interface CarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Car row);

    Car selectByPrimaryKey(Long id);

    List<Car> selectAll();

    int updateByPrimaryKey(Car row);
}