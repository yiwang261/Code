package com.it.Service.Impl;

import com.it.Mapper.AccountMapper;
import com.it.Pojo.Account;
import com.it.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountMapper accountMapper;
    @Override
    public int save(Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public int deleteByActNo(String ActNo) {
        return accountMapper.deleteByNo(ActNo);
    }

    @Override
    public int modify(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public Account getByActNo(String actNo) {
        return accountMapper.selectByActNo(actNo);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer(String fromActNo, String toActNo,double money) {
        Account fromAccount = accountMapper.selectByActNo(fromActNo);
        if (fromAccount.getBalance() < money){
            throw  new RuntimeException("账户余额不足");
        }

        Account toAccount = accountMapper.selectByActNo(toActNo);
        fromAccount.setBalance(fromAccount.getBalance()-money);
        toAccount.setBalance(toAccount.getBalance()+money);

        int count = accountMapper.update(fromAccount);
        count += accountMapper.update(toAccount);

        if(count!=2){
            throw new RuntimeException("转账失败");
        }
    }
}
