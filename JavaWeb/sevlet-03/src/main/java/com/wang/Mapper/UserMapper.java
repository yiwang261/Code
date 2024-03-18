package com.wang.Mapper;

import com.wang.POJO.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
//    public User Login(@Param("name1") String name,@Param("password") String password);
    public User Login(User user);
    public User select(User user);

    public void insert(User user);
}
