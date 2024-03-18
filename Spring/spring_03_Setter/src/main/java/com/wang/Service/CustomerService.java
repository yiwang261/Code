package com.wang.Service;

import com.wang.Mapper.BookMapper;
import com.wang.Mapper.UserMapper;

public class CustomerService {
    private BookMapper bookMapper;
    private UserMapper userMapper;

    public CustomerService(BookMapper bookMapper, UserMapper userMapper) {
        this.bookMapper = bookMapper;
        this.userMapper = userMapper;
    }

    public void save(){
        bookMapper.save();
        userMapper.umSave();
        System.out.println("cs ....");
    }
}
