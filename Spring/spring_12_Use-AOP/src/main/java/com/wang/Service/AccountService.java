package com.wang.Service;


import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountService {
    public void transfer(){
        System.out.println("正在转账。。。");
    }

    public void withdraw(){
        System.out.println("正在取款...");
    }
}
