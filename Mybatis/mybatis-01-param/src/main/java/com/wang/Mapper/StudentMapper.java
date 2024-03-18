package com.wang.Mapper;

import com.wang.POJO.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StudentMapper {
    /***
     * 使用param注解告诉Mybatis在创建Map的时候的key是什么
     * @param name  map.put("name",name)
     * @param sex   map.put("sex",sex)
     * @return
     */
    List<Student>   selectByNameAndSexUseParam(@Param("name") String name,@Param("sex") Character sex);
    List<Student> selectByNameAndSex(String name,Character sex);
    int insertByPojo(Student student);
//    通过map参数进行传递参数
    int insertByMap(Map<String,Object> paramMap);
    List<Student>   SelectById(Long id);
    List<Student>   SelectByName(String name);
    List<Student>   SelectByBirth(Date birth);
    List<Student>   SelectBySex(Character sex);

}
