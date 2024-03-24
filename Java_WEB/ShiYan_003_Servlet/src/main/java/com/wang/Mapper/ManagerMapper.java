package com.wang.Mapper;

import com.wang.Bean.Manager;

public interface ManagerMapper {
    Manager selectUserByUsername(String username);
    int insertUser(Manager manager);
    int updateUser(Manager manager);
    int deleteUser(String username);

}
