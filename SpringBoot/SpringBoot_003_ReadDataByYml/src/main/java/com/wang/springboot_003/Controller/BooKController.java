package com.wang.springboot_003.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BooKController {
    @Value("${value}")
    String value;
    @GetMapping("/get")
    public String getBook(){
        System.out.println(value);
        return "Book";
    }
}
