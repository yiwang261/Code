package com.wang;

import com.wang.Bean.Book;
import com.wang.Controller.BookController;
import com.wang.Mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot008MybaitsApplicationTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
        Book byId = bookMapper.getById("123");
        System.out.println(byId);
    }

}
