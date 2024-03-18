package com.wang.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");

        return "{'name':'zhangsan'}";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello world ...");
        return "hello world!";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        System.out.println("hello world ...");
        return "index";
    }

}
