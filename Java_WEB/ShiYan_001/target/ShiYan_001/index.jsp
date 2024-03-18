<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<h1>登录成功</h1> <%=request.getParameter("username")%>


<form action="logout" method="post">
    <button type="submit">注销</button>
</form>

</body>
</html>
