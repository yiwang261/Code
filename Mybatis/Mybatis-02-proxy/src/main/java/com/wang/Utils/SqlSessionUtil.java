package com.wang.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SqlSessionUtil {
    private SqlSessionUtil(){}
    @Test
    public void main(){
        System.out.println(111);
    }
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            sqlSessionFactory =  new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }

}
