package com.wang.MapperTest;

import com.wang.Mapper.StudentMapper;
import com.wang.POJO.Student;
import com.wang.Utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void testselectByCidStepTwo(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        List<Student> students = sqlSession.getMapper(StudentMapper.class).selectByCidStepTwo(1000);
        students.forEach(student ->{
            System.out.println(student);
        });
    }
    @Test
    public void testSelectByIdStep(){
        SqlSession sqlSession  = SqlSessionUtil.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectByIdStep(1);
        System.out.println(student);
    }
    @Test
    public void testSelectByIdAssociation(){
        SqlSession sqlSession  = SqlSessionUtil.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectByIdAssociation(1);
        System.out.println(student);
        sqlSession.commit();
    }
    @Test
    public void testSelectById(){
        SqlSession sqlSession  = SqlSessionUtil.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectById(1);
        System.out.println(student);
        sqlSession.commit();
    }
}
