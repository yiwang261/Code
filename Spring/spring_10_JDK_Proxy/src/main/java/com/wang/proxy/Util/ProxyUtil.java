package com.wang.proxy.Util;

import com.wang.proxy.Service.OrderService;
import com.wang.proxy.Service.TimerHandler;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Object newProxy(Object target){

        OrderService proxyInstance = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new TimerHandler(target));

        return proxyInstance;
    }
}
