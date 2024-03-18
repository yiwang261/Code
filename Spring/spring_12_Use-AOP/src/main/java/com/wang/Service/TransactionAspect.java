package com.wang.Service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAspect {

//    @Pointcut("execution(void com.wang.Service.AccountService.*())")
//    private void p(){}

    @Around("execution(void com.wang.Service.AccountService.*())")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("开启事务");

            joinPoint.proceed();

            System.out.println("提交事务");

        } catch (Throwable e) {

            System.out.println("回滚事务");
            e.printStackTrace();
        }


    }


}
