package com.wang.Util;



import java.sql.*;

public class DBUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private DBUtil(){}
    private static final String url = "jdbc:mysql://127.0.0.1/wang";
    private static final String username = "root";
    private static final String password = "gyw123...";

    public static Connection getConnection(){
        Connection connection = null;

            try {
                connection = DriverManager.getConnection(url,username,password);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        return connection;
    }


    public static void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){

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


}
