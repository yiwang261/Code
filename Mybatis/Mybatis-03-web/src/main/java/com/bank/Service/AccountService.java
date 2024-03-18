package com.bank.Service;

public interface AccountService {
    /**
     * @param fromActno 转出账号
     * @param toActno 转入账号
     * **/
    void transfer(String fromActno, String  toActno,double money);
}
