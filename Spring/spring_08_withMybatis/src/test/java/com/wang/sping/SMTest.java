package com.wang.sping;

import com.XmlMybatis.Pojo.Account;
import com.XmlMybatis.Service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SMTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        List<Account> all = accountService.getAll();
        all.forEach(account -> System.out.println(account));
//        Account act001 = accountService.getByActNo("act001");
//        System.out.println(act001);
//        accountService.transfer("act001","act002",1000);
    }
}
