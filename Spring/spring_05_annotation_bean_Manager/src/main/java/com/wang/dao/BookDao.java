package com.wang.dao;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
//@Component("bookDao")
@Repository//("bookDao")
@Scope("prototype")
public class BookDao {
    @Value("${name}")
    private String name;
    public void save(){
        System.out.println("book dao save..."+name);
    }



    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
