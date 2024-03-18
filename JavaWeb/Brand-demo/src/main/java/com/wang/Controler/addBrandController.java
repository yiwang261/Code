package com.wang.Controler;

import com.alibaba.fastjson2.JSON;
import com.wang.POJO.Brand;
import com.wang.Service.BrandService;
import com.wang.Service.Impl.BrandServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/addBrand")
public class addBrandController extends HttpServlet {
    BrandService brandService = new BrandServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        Brand brand = JSON.parseObject(s, Brand.class);
        System.out.println(111111);
        int insert = brandService.insert(brand);


        resp.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
