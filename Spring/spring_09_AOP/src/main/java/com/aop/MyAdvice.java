package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {


    @Pointcut("execution(void com.aop.Mapper.UserMapper.update())")
    private void pointcut(){}

    @Pointcut("execution(int com.aop.Mapper.UserMapper.delete())")
    private void pointcut2(){}
//    @Before("pointcut()")
//    public void time(){
//        System.out.println(System.currentTimeMillis());
//    }


    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before.......");
        joinPoint.proceed();
        System.out.println("after......");
    }

    @Around("pointcut2()")
    public Object ret(ProceedingJoinPoint point) throws Throwable {
        System.out.println("aaaaaaaaaaaaaa");
        Object ret = point.proceed();
        System.out.println("bbbbbbbbbbbbbbbbbbb");

        return ret;
    }
}
