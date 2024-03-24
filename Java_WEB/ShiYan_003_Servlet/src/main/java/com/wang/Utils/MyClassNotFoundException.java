package com.wang.Utils;

public class MyClassNotFoundException extends RuntimeException {
    public MyClassNotFoundException(){

        super("数据库返回的类型 没匹配完");
    }
    public MyClassNotFoundException(String msg){
        super(msg);
    }

}
