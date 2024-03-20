package com.wang.Servlet;

import com.wang.Bean.User;
import com.wang.Service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet  extends HttpServlet{

    private UserService userService = new UserService();
    String username;
    String password;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        username = req.getParameter("username");
        password = req.getParameter("password");


        System.out.println("当前在线人数：" +OnlineListener.count);
        if(userService.checkLogin(username,password)){
            HttpSession session = req.getSession();
            session.setAttribute("login","true");
            RequestDispatcher dispatcher= req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req,resp);
        }else {
//            HttpSession session = req.getSession();
            req.getSession().setAttribute("msg", "用户名或密码错误");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
