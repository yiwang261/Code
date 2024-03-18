package com.wang.Utils;

public class JsonUtil {
    private int code;
    private String msg;
    private Object data;

    public JsonUtil() {}
    public JsonUtil(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static JsonUtil success(Object data) {
        return new JsonUtil(200, "success", data);
    }
    public static JsonUtil error(String msg) {
        return new JsonUtil(500, msg, null);
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

    public void setData(Object data) {
        this.data = data;
    }
}
