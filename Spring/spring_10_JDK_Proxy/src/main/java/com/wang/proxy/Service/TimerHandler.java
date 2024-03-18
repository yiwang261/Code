package com.wang.proxy.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;




public class TimerHandler implements InvocationHandler {
    private Object target;

    public TimerHandler(Object obj){
        target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin = System.currentTimeMillis();

        Object retValue = method.invoke(target,args);

        long end = System.currentTimeMillis();

        System.out.println("耗时:"+(end-begin));

        return retValue;
    }
}
