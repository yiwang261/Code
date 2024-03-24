package com.wang.Servlet;

import com.alibaba.fastjson2.JSON;
import com.wang.Bean.Brands;
import com.wang.Mapper.Impl.ManagerMapperImpl;
import com.wang.Mapper.ManagerMapper;
import com.wang.Service.ManagerService;
import com.wang.Utils.ResultUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ManagerService managerService = new ManagerService();

            System.out.println(req.getParameter("username"));
            System.out.println(req.getParameter("password"));
        PrintWriter writer = resp.getWriter();

        Boolean success = managerService.checkLogin(req.getParameter("username"), req.getParameter("password"));
        if(success){
            writer.write(ResultUtil.success());
        }else {
            writer.print(ResultUtil.failure("账号或密码错误"));

        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
