package com.wang.Servlet;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

import java.util.concurrent.atomic.AtomicInteger;


public class OnlineListener implements HttpSessionListener {
    final static AtomicInteger count = new AtomicInteger(0);


    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        count.incrementAndGet();

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        count.decrementAndGet();
    }
}
