package com.wang.Service;

import com.wang.dao.BookDao;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }

    public void save(){
        System.out.println("BookService save");
        bookDao.save();
    }
}
