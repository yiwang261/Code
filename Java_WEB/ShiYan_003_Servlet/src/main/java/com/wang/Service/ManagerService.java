package com.wang.Service;

import com.wang.Bean.Manager;
import com.wang.Mapper.Impl.ManagerMapperImpl;
import com.wang.Mapper.ManagerMapper;

public class ManagerService {
    private ManagerMapper managerMapper;

    public Boolean checkLogin(String username, String password){

        if(username==null||password==null)
            return false;

        managerMapper = new ManagerMapperImpl();
        Manager manager = managerMapper.selectUserByUsername(username);
        if(manager == null){
            return false;
        }
        if(manager.getPassword().equals(password)){
            return true;
        }
        return false;
    }

}
