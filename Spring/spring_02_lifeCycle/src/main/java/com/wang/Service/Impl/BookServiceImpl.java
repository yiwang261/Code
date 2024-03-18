package com.wang.Service.Impl;

import com.wang.Mapper.BookMapper;
import com.wang.Service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookMapper bookMapper;
    @Override
    public void save() {
        System.out.println("book Service is working");
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper=bookMapper;
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }
}
