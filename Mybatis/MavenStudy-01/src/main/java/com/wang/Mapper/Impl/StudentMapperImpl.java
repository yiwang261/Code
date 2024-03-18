package com.wang.Mapper.Impl;

import com.wang.Mapper.StudentMapper;
import com.wang.POJO.Student;
import com.wang.Utils.MyUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentMapperImpl implements StudentMapper {




    @Override
    public int Insert(Student student) {
        int cnt;
        try {
            SqlSession  sqlSession = MyUtil.openSqlSession();
             cnt=sqlSession.insert("StudentMapper.insertStudent",student);
             sqlSession.commit();
             sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return cnt;
    }

    @Override
    public int DeleteById(Student student) {
        int cnt;
        try {
            SqlSession sqlSession = MyUtil.openSqlSession();
            cnt = sqlSession.delete("StudentMapper.deleteById",student);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cnt;
    }

    @Override

    public int UpdateById(Student student) {
        SqlSession sqlSession ;
        int cnt;
        try {
             sqlSession = MyUtil.openSqlSession();
             cnt = sqlSession.update("StudentMapper.updateById",student);
             sqlSession.commit();
             sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cnt;
    }

    @Override
    public List<Student> QueryAll() {
        int cnt;
        List<Student>students;
        try {
            SqlSession sqlSession = MyUtil.openSqlSession();
            students = sqlSession.selectList("StudentMapper.selectAll");
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return students;
    }

    @Override
    public Student QueryByName(String Name) {
        Student student;
        try {
            SqlSession sqlSession = MyUtil.openSqlSession();
             student = sqlSession.selectOne("StudentMapper.selectByName",Name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return student;
    }
}
