package com.XmlMybatis.Mapper;

import com.XmlMybatis.Pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountMapper")
public interface AccountMapper {
    int insert(Account account);
    int deleteByNo(String actNo);
    int update(Account account);
    Account selectByActNo(String actNo);

    List<Account> selectAll();
}
