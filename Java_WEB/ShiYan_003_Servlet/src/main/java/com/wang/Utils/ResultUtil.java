package com.wang.Utils;

import com.alibaba.fastjson2.JSON;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class  ResultUtil <T>{

    public ResultUtil(){}
     private String msg ;
     private T data;
     private int code;

     private  ResultUtil(String msg, int code, T data){
         this.msg = msg;
         this.code = code;
         this.data = data;
     }
    private  ResultUtil(String msg, int code){
        this.msg = msg;
        this.code = code;
    }
     private ResultUtil(String msg){
         this.msg = msg;
     }

    public static String success (){
        return JSON.toJSONString(new ResultUtil<>("success",200,null));
    }
    public static String failure(String msg){
        return JSON.toJSONString(new ResultUtil<>(msg,403,null));
    }

    public static <T> String getData(T data){
         return JSON.toJSONString(new ResultUtil<>("success",200,data));
    }
}
