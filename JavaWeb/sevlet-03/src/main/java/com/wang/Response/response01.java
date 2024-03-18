package com.wang.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;

import java.io.*;

@WebServlet("/resp1")
public class response01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(302);
//        resp.setHeader("Location","/servlet/resp02");
//        resp.setContentType("text/html");
//        PrintWriter writer = resp.getWriter();
//        writer.write("<h1>你好</h1>");
//        resp.sendRedirect("/servlet/resp02");
        int len;
        FileInputStream fileInputStream = new FileInputStream("C:/Users/yiwan/Desktop/girl.webp");
        ServletOutputStream outputStream = resp.getOutputStream();
        byte[] bytes = new byte[1024];
        while((len = fileInputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        outputStream.close();
    }
//@Test  //Copy picture
//    public void test(){
//        FileInputStream inputStream = null;
//        FileOutputStream outputStream = null;
//        int len = 0;
//        try {
//            inputStream = new FileInputStream("E:/girl.webp");
//            outputStream = new FileOutputStream("C:\\Users\\yiwan\\Desktop\\beauty.webp");
//            byte buff[] = new byte[1024];
//            while((len = inputStream.read(buff))!=-1){
//                outputStream.write(buff,0,len);
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            if (outputStream != null) {
//                try {
//                    outputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
}
