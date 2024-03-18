package com.wang.Bean;

/***
 * 实例工厂模式 工厂方法模式
 */
public class UserFactory {
    public static User getUser(){
        return new User();
    }
}
