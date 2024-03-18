package com.wang.Servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/*")
public class LoginFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        String requestURI = request.getRequestURI();
        if (requestURI.startsWith("/login")){
            chain.doFilter(request,response);
        }else if(request.getSession().getAttribute("login")==null){
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else {
            chain.doFilter(request,response);
        }
    }
}
