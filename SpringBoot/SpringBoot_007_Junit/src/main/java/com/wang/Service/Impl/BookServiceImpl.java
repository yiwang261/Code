package com.wang.Service.Impl;

import com.wang.Service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("saving");
    }
}
