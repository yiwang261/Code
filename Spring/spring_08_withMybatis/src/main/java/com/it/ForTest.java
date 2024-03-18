package com.it;

import com.it.Config.SpringConfig;
import com.it.Pojo.Account;
import com.it.Service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

public class ForTest {
    @Test
    public void testMybatis(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        List<Account> accounts = accountService.getAll();
        accounts.forEach(account -> {
            System.out.println(account);
        });
    }



}
