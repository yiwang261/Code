package com.aop.Mapper;


import org.springframework.stereotype.Repository;

@Repository("userMapper")
public class UserMapperImpl implements UserMapper{
    public void update(){
        System.out.println("update...");
    }

    public int delete(){
        System.out.println("delete...");
        return 100;
    }
}
