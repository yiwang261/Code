package com.wang.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        long begin = System.currentTimeMillis();

        Object retVal = methodProxy.invokeSuper(target, objects);

        long end = System.currentTimeMillis();

        System.out.println(end-begin);

        return retVal;
    }
}
