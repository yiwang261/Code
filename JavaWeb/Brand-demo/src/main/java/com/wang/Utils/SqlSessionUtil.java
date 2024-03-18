package com.wang.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private SqlSessionUtil(){}
    private static  SqlSessionFactory SqlSession_Factory;
    static{
        String url = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(url);
            SqlSession_Factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSession openSqlSession(){
        return SqlSession_Factory.openSession();
    }




}
