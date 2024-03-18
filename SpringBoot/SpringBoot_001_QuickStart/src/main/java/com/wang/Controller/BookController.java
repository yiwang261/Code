package com.wang.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping("/{id}")
    public String getById(@PathVariable int id){
        System.out.println(id);
        return "Hello world!aaa";
    }
}

