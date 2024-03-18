package com.wang.sevlet03;

import com.wang.Mapper.UserMapper;
import com.wang.POJO.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        String[] hobby = req.getParameterValues("");
//        System.out.println(username);
//        System.out.println(password);
//        for (String a:
//             hobby) {
//            System.out.println(a);
//        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(username, password);
        User user1 = mapper.Login(new User("1606883381", "gyw123..."));
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        if(user1!=null){
            writer.write("登录成功");
        }else {
            writer.write("登录失败");
        }
        sqlSession.close();
//        UserMapper userMapper = SqlSq
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
        String username =  req.getParameter("username");
//        byte[] bytes = username.getBytes(StandardCharsets.ISO_8859_1);
//        username = new String(bytes,"UTF-8");


//        username = new String(username.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
//        System.out.println(username);
    }
    @Test
    public void test(){
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User("1606883381", "gyw123...");
        User login = mapper.Login(user);
        System.out.println(login);
    }
}
