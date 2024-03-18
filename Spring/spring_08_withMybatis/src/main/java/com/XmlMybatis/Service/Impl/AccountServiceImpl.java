package com.XmlMybatis.Service.Impl;

import com.XmlMybatis.Mapper.AccountMapper;
import com.XmlMybatis.Pojo.Account;
import com.XmlMybatis.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("accountService")
public class AccountServiceImpl implements AccountService {


//    private final AccountMapper accountMapper;
//
//    public AccountServiceImpl(@Qualifier("accountMapper") AccountMapper accountMapper) {
//        this.accountMapper = accountMapper;
//    }


    @Autowired
    @Qualifier("accountMapper")
    private AccountMapper accountMapper;

//    public void setAccountMapper(AccountMapper accountMapper) {
//        this.accountMapper = accountMapper;
//    }


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
