package com.wang.Controller;

import com.alibaba.fastjson2.JSON;
import com.wang.Util.JsonUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/login")
    public void login(){
        System.out.println("login");
    }
//    @RequestMapping(value = "/save" ,method = RequestMethod.GET)
    @GetMapping("/save")
    public String save(){
        Book book = new Book();
        book.setName("计算机体系结构");
        book.setPrice("999");



        return JsonUtil.success(book);
    }
}
