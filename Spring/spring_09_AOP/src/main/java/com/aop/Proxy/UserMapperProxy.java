package com.aop.Proxy;

import com.aop.Mapper.UserMapper;

public class UserMapperProxy implements UserMapper {

    private UserMapper target;

    public  UserMapperProxy(UserMapper userMapper){
        this.target=userMapper;
    }

    @Override
    public int delete() {
        long begin = System.currentTimeMillis();
        target.delete();
        long end = System.currentTimeMillis();
        System.out.println("删除耗时"+(end-begin));
        return 100;
    }

    @Override
    public void update() {
        long begin = System.currentTimeMillis();
        target.update();
        long end = System.currentTimeMillis();
        System.out.println("删除耗时"+(end-begin));
    }
}
