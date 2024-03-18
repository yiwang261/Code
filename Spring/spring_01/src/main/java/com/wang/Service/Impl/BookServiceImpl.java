package com.wang.Service.Impl;

import com.wang.Mapper.BookMapper;
import com.wang.Mapper.Impl.BookMapperImpl;
import com.wang.Service.BookService;

public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;
    @Override
    public void save() {
        System.out.println("book Service is working");
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper=bookMapper;
    }


}
