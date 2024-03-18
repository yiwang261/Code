package com.wang.Servlet;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebFilter(urlPatterns = "/*")
public class UserCountFilter extends HttpFilter {
    private AtomicInteger integer = new AtomicInteger(0);
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServlet = (HttpServletRequest) request;
        HttpSession session = httpServlet.getSession();

        session.setAttribute("entry",System.currentTimeMillis());
        integer.incrementAndGet();
        try {
            chain.doFilter(request, response);
        } finally {
            if (session.getAttribute("entry") == null){
                    integer.decrementAndGet();
            }
        }
        System.out.println(integer);


    }
    public int getNumber(){
        return integer.get();
    }
}
