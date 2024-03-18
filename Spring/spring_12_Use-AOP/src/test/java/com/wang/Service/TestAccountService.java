package com.wang.Service;

import com.wang.Config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAccountService {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        accountService.transfer();
    }
}
