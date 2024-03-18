package com.it.Mapper;


import com.it.Pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountMapper")
public interface AccountMapper {
    int insert(Account account);
    int deleteByNo(String actNo);
    int update(Account account);
    Account selectByActNo(String actNo);

//    @Select("select * from wang.t_act")
    List<Account> selectAll();
}
