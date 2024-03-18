package com.aop;

import com.aop.Config.SpringConfig;
import com.aop.Mapper.UserMapper;
import com.aop.Mapper.UserMapperImpl;
import com.aop.Proxy.UserMapperProxy;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    @Test
    public void testUserMapper(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserMapper userMapperImpl = applicationContext.getBean("userMapper", UserMapper.class);

        userMapperImpl.delete();
    }

    @Test
    public void testProxy(){
        UserMapper userMapper = new UserMapperImpl();

        UserMapper target = new UserMapperProxy(userMapper);
        target.update();
        target.delete();
    }



    @Test
    public void testReturn(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserMapper userMapperImpl = applicationContext.getBean("userMapper", UserMapper.class);

        int delete = userMapperImpl.delete();
        System.out.println(delete);
    }

}
