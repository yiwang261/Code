package com.wang.ajax_demo.FastJson;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

public class FastJsonDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("gyw123...");

        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);

        User jsonUser =JSON.parseObject(jsonString,User.class);
        System.out.println(jsonUser);
    }
}
