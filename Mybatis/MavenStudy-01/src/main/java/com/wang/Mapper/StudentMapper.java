package com.wang.Mapper;

import com.wang.POJO.Student;

import java.util.List;

public interface StudentMapper {
    int Insert(Student student) ;
    int DeleteById(Student student);
    int UpdateById(Student student);
    List<Student> QueryAll();
    Student QueryByName(String name);
}
