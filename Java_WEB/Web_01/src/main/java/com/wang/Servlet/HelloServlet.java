package com.wang.Servlet;

import jakarta.servlet.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.apache.catalina.filters.FailedRequestFilter;
import org.apache.coyote.Request;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        UserCountFilter userCountFilter = new UserCountFilter();


        Cookie cookie =new Cookie("jsessionid",req.getSession().getId());
        cookie.setMaxAge(1000*60);
        resp.addCookie(cookie);

        PrintWriter writer = resp.getWriter();
        writer.print("hello world");
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("pwd"));

        req.getSession().setAttribute("username",req.getParameter("username"));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome.jsp");
        requestDispatcher.forward(req,resp);


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getParameter("name"));
//        System.out.println(req.getParameter("pwd"));
        this.doGet(req,resp);
    }
}
