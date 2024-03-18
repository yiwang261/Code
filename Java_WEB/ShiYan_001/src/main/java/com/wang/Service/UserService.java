package com.wang.Service;

import com.wang.Bean.User;
import com.wang.Mapper.UserMapper;

public class UserService {

    private UserMapper userMapper = new UserMapper();
    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
}
