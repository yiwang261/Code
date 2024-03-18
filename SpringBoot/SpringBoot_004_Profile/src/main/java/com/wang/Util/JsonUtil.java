package com.wang.Util;

import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;

public  class JsonUtil<T>{
    String msg;
    String code;
    T data;

    @Override
    public String toString() {
        return "Json{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", data=" + data +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> String success(T data){
        JsonUtil<T> jsonUtil = new JsonUtil<>();
        jsonUtil.setData(data);
        jsonUtil.setCode("200");
        jsonUtil.setMsg("success");

        return  JSON.toJSONString(jsonUtil);
    }



}
