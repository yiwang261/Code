<%--
  Created by IntelliJ IDEA.
  User: yiwan
  Date: 2024/3/11
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WelCome</title>
</head>
<body>

<h1>Welcome</h1>
<%= request.getSession().getAttribute("username")%>

<%--${1+1=2?"对":"错"}--%>
</body>
</html>
