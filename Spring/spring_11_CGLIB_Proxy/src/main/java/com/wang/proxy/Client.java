package com.wang.proxy;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {

//        字节码增强对象
        Enhancer enhancer = new Enhancer();

//        告诉 CGLIB 目标对象是谁
        enhancer.setSuperclass(UserService.class);


        enhancer.setCallback(new TimeMethodInterceptor());

        UserService userService   = (UserService) enhancer.create();
        userService.login("admin","admin");

        userService.logout();
    }
}
