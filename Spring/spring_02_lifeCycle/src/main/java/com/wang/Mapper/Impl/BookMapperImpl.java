package com.wang.Mapper.Impl;

import com.wang.Mapper.BookMapper;
import com.wang.Service.Impl.BookServiceImpl;

public class BookMapperImpl implements BookMapper {
    @Override
    public void save() {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
        System.out.println("book data is saving...");
    }
}
