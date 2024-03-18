package com.wang.sevlet03;

import com.wang.Mapper.UserMapper;
import com.wang.POJO.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class test {
    @Test
    public void testInsert(){
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));

            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.insert(new User("zhangsan1","123456"));
            sqlSession.commit();
            sqlSession.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test01() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User zhangsan = mapper.select(new User("zhangsan","123456"));
        System.out.println(zhangsan);
    }
    @Test
    public void testSelect(){
        SqlSessionFactory sqlSessionFactory;
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.Login(new User("zhangsan1","123456"));
    }

}
