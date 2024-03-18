package com.wang;

import com.wang.Mapper.Impl.StudentMapperImpl;
import com.wang.Mapper.StudentMapper;
import com.wang.POJO.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentMapperTest {
    static StudentMapper studentMapper = new StudentMapperImpl();
    @Test
    public void testQueryByName(){
       Student student  = studentMapper.QueryByName("钱钱钱");
        System.out.println(student);
    }
    @Test
    public void testInert(){
//        String name, int age, String phoneNumber, String from, String birth,String id
        Student student = new Student("王某",26,"1606883381","四川",11);

        int cnt = studentMapper.Insert(student);
        System.out.println(cnt);
    }

    @Test
    public void testDelete(){
        Student student = new Student("王某",26,"1606883381","四川",11);
        studentMapper.DeleteById(student);
    }

    @Test
    public void testQueryAll(){
     List<Student> students =  studentMapper.QueryAll();
        for (Student s :
                students) {
            System.out.println(s);
        }
    }
    @Test
    public void testUpdateById(){
        Student student = new Student("钱钱钱",99,"9999999","海南",2);
        int cnt = studentMapper.UpdateById(student);
        System.out.println(cnt);
    }
}
