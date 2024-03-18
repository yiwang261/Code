package com.wang.TestMapper;

import com.wang.Mapper.StudentMapper;
import com.wang.POJO.Student;
import com.wang.Utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StudentMapperTest {

    @Test
    public void testSelectByNameAndSexUseParam(){
        List<Student> students = new ArrayList<>();
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
//        mapper实际上指向了代理对象
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        mapper是代理对象
//        代理方法
        students = mapper.selectByNameAndSexUseParam("郭某",'男');
        students.forEach(student -> System.out.println(student));

    }

    @Test
    public void testSelectByNameAndSex(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = new ArrayList<>();

        students = mapper.selectByNameAndSex("郭某",'男');
        for (Student student :
                students) {
            System.out.println(student);
        }
    }

    @Test
    public void testInsertByPojo(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student(null,"郭某",18,1.83,new Date(2002-07-01),'男');
        mapper.insertByPojo(student);
        sqlSession.commit();
        sqlSession.close();
    }
//    通过map传参插入数据
    @Test
    public void testInsertByMap(){
        SqlSession sqlSession  = SqlSessionUtil.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Map<String, Object> studentMap = new HashMap<>();

        studentMap.put("姓名","赵六");
        studentMap.put("年龄",22);
        studentMap.put("身高",1.82);
        studentMap.put("性别","男");
        studentMap.put("生日",new Date());

        mapper.insertByMap(studentMap);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testSelectById(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = studentMapper.SelectById(1L);
        for (Student s :
                students) {
            System.out.println(s);
        }
        sqlSession.close();
    }
}
