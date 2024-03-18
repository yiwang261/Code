package com.wang.DaoTest;

import com.wang.config.SpringConfig;
import com.wang.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
    @Test
    public void testDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);

        bookDao.save();
    }


    @Test
    public void completeAnnotation(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);
        bookDao.save();
    }
}
