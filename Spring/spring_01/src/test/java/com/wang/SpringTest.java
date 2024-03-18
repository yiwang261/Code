package com.wang;

import com.wang.Mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookMapper =(BookMapper) applicationContext.getBean("bookMapper");
        bookMapper.save();
        applicationContext.close();

    }
}
