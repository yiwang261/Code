package com.wang.Mapper;

import com.wang.Pojo.Car;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CarMapper {
    int deleteBachWithOr(@Param("ids") Long []id);
    /***
     * 批量插入
     * @param cars
     * @return
     */
    int insertBach(@Param("cars") List<Car> cars);

//    批量删除
     int DeleteByIds(@Param("ids") Long []ids);

    /***
     *  通过choose when otherwise
     * @param brand
     * @param guidePrice
     * @param carType
     * @return
     */
    List<Car> selectByChoose(@Param("brand") String brand,@Param("guidePrice") Double guidePrice,@Param("carType") String carType);
    int Update(Car car);
    int UpdateBySet(Car car);
    List<Car> selectByManyParam(@Param("brand") String brand,@Param("guidePrice") Double guidePrice,@Param("carType") String carType);
    /***
     * 使用resultMap标签进行结果集映射
     * @return
     */
    List<Car> selectAllByResultMap();

//    大的Map里的key就是主键 通过@Mapkey进行设置
//    value就是类似pojo类  但是合适的pojo进行封装
//    因此采取使用map进行封装key就是属性名 value就是属性值
    @MapKey("id")
    Map<Long, Map<String, Object>> selectAllRetMap();

//    没有合适的pojo类进行封装的时候就采取Map的方式进行封装key就是属性名 value就是值
    List<Map<String, Object>> selectAllByMap();
    List<Car> selectAll();
    Car selectById (Long id);


}
