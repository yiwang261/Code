package com.wang.Mapper.Impl;

import com.wang.Bean.Manager;
import com.wang.Mapper.ManagerMapper;
import com.wang.Utils.DBRunner;

import java.util.List;

public class ManagerMapperImpl implements ManagerMapper {
    DBRunner<Manager> runner = new DBRunner<Manager>();
    @Override
    public Manager selectUserByUsername(String username) {


        String sql = "select * from t_manager where username = ?";
        List<Manager> list = runner.Query(sql, Manager.class, username);
        if(list.size() == 0) return null;
        return list.get(0);
    }

    @Override
    public int insertUser(Manager manager) {

        String sql = "insert into t_manager(id, username, password, nickName) values(?,?,?,?)";

        return runner.Update(sql, manager.getId(), manager.getUsername(), manager.getPassword(), manager.getNickName());
    }

    @Override
    public int updateUser(Manager manager) {



        return 0;
    }

    @Override
    public int deleteUser(String username) {
        String sql = "delete from t_manager where username = ?";
        int i = runner.Update(sql, username);
        System.out.println(i);
        return i;
    }
}
