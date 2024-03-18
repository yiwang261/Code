package com.wang.Controler;

import com.wang.POJO.Brand;
import com.wang.Service.BrandService;
import com.wang.Service.Impl.BrandServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.alibaba.fastjson2.JSON;

@WebServlet("/SelectAll")
public class SelectAllBrandController extends HttpServlet {
    BrandService brandService = new BrandServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Brand> brands = brandService.selectAll();
        String json = JSON.toJSONString(brands);
        PrintWriter writer = resp.getWriter();

        resp.setContentType("text/json;UTF-8");
        writer.write(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
