package com.wang.Mapper;

import com.wang.Bean.User;
import com.wang.Util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {

    public User getUserById(String username)
    {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "select * from wang.tb_user where name = ?";

        User user = new User();
        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,username);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                resultSet.getInt("id");
                resultSet.getString("name");
                resultSet.getString("password");
                resultSet.getString("nickName");

                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                user.setNickName(resultSet.getString("nickName"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeConnection(connection, preparedStatement, resultSet);
        }


        return user;
    }

    public int addUser(User user)
    {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        int count = 0;

        String sql = "insert into wang.tb_user (id, name, password, nickName) VALUE (?, ? , ? , ?)";

        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(2,user.getUsername());
            preparedStatement.setString(3,user.getPassword());
            preparedStatement.setString(4,user.getNickName());

            count = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeConnection(connection, preparedStatement, resultSet);
        }

        return count;
    }

    public boolean delete(int id){
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        boolean success = false;

        String sql = "delete from wang.tb_user where id = ?";

        User user = new User();
        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,id);
            success = preparedStatement.execute();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeConnection(connection, preparedStatement, resultSet);
        }


        return success;
    }
}
