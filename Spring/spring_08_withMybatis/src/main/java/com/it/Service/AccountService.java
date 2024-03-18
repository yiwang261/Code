package com.it.Service;

import com.it.Pojo.Account;

import java.util.List;


public interface AccountService {
    int save(Account account);
    int deleteByActNo(String actNo);
    int modify(Account account);
    Account getByActNo(String actNo);
    List<Account> getAll();
    void transfer(String fromActNo,String toActNo,double money);
}
