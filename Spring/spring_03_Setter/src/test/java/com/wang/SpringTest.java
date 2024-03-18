package com.wang;

import com.wang.Bean.Goods;
import com.wang.Bean.User;
import com.wang.Mapper.BookMapper;
import com.wang.Service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testMessage(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Goods goods = applicationContext.getBean("goods", Goods.class);
        System.out.println(goods);
    }

    @Test
    public void testJianDanShuJuLeiXing(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

    }

    @Test
    public void testSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookMapper =(BookMapper) applicationContext.getBean("bookMapper");
//        bookMapper.setBookMapper(bookMapper);
        bookMapper.save();
    }

    @Test
    public void testCs(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = applicationContext.getBean("csService", CustomerService.class);
        customerService.save();
    }
}
