package com.wang.proxy.Service;

public class OrderServiceImpl implements OrderService{
    @Override
    public String getName() {
        System.out.println("getName");
        return "张三";
    }

    @Override
    public void generate() {
        System.out.println("Generate...");
    }

    @Override
    public void modify() {
        System.out.println("modify...");
    }

    @Override
    public void detail() {
        System.out.println("detail...");
    }
}
