package com.wang.Utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;


public class DBUtil {
    private DBUtil(){}
    static Properties properties = new Properties();
    static {
        try {
            properties.load(DBUtil.class.getClassLoader().getResourceAsStream("data.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Class.forName(properties.getProperty("Driver"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



    static String url = properties.getProperty("url");
    static String username = properties.getProperty("username");
    static String password = properties.getProperty("password");

    public static Connection getConnection(){

        try {

            return DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeConnection(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if(preparedStatement!=null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void closeConnection( PreparedStatement preparedStatement, Connection connection){


        if(preparedStatement!=null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
