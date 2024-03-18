package com.wang.MapperTest;

import com.wang.Mapper.ClazzMapper;
import com.wang.POJO.Clazz;
import com.wang.POJO.Student;
import com.wang.Utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ClazzMapperTest {
    @Test
    public void testSelectByStepOne(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = mapper.selectByStepOne(1000);
        System.out.println(clazz.getStudents());
        sqlSession.close();
    }
    @Test
    public void testSelectByCollection(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = mapper.selectByCollection(1001);
        System.out.println(clazz);
//        List<Student> students = clazz.getStudents();
//        students.forEach(student ->{
//            System.out.println(student);
//        });
        sqlSession.commit();
    }

}
