package com.wang.dao;


import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository("bookDao")
public class BookDao {
    public void save(){
        System.out.println("book dao save...");
    }
}
