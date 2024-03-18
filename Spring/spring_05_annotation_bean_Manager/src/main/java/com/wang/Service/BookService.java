package com.wang.Service;

import com.wang.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BookService")
public class BookService {

//    @Autowired
//    @Qualifier("bookDao")
    private BookDao bookDao;
    @Autowired
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }

    public void save(){
        System.out.println("BookService save");
        bookDao.save();
    }
}
