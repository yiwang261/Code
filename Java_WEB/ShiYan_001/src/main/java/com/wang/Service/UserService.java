package com.wang.Service;

import com.wang.Bean.User;
import com.wang.Mapper.UserMapper;

public class UserService {

    private UserMapper userMapper = new UserMapper();
    public User getUserByUsername(String username){
        return userMapper.getUserByUserName(username);
    }

    public Boolean checkLogin(String username, String password){
        User user = this.getUserByUsername(username);
        if(user==null) return false;
        else return user.getPassword().equals(password);

    }
}
