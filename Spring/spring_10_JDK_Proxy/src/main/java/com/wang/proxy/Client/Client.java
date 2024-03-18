package com.wang.proxy.Client;

import com.wang.proxy.Service.OrderService;
import com.wang.proxy.Service.OrderServiceImpl;
import com.wang.proxy.Util.ProxyUtil;

public class Client {
    public static void main(String[] args) {
//        目标对象
        OrderService target = new OrderServiceImpl();

//        创建代理对象
        OrderService o = (OrderService)ProxyUtil.newProxy(target);

        System.out.println(o.getName());

    }
}
