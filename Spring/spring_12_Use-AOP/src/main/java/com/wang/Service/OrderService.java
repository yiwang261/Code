package com.wang.Service;


import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {
    public void generate(){
        System.out.println("正在生成订单...");
    }


    public void cancel(){
        System.out.println("订单已取消...");
    }
}
