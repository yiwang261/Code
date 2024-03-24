package com.wang.Utils;

import com.alibaba.fastjson2.JSON;

public class JsonUtil <T>{
    private int code;
    private String msg;
    private T data;

    public JsonUtil() {}
    public JsonUtil(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static <T> String success(T data) {
        return JSON.toJSONString(new JsonUtil<>(200, "success", data));
    }
    public static  String error(String msg) {
        return JSON.toJSONString(new JsonUtil<>(500, msg, null));
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
