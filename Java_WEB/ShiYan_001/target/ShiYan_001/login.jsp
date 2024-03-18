<%--
  Created by IntelliJ IDEA.
  User: yiwan
  Date: 2024/3/12
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<% String msg = (String) request.getSession().getAttribute("msg");%>
    <form action="login" method="post">
        <label>账号:<input type="text" name="username"></label> <span style="color: red"><%=msg==null?"":msg%></span>
        <br>

        <label>密码:<input type="password" name="password"></label> <br>

        <button type="submit">登录</button>

    </form>
</body>
</html>
