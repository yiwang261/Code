package com.wang.Mapper;

import com.wang.POJO.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectByCidStepTwo(Integer cid);
    Student selectByIdStep(Integer id);

    Student selectByIdAssociation(Integer id);
    /***
     * 根据学生id查询学生信息 包括学生班级
     * @param id
     * @return
     */
    Student selectById(Integer id);
}
