<%@ page import="com.wang.Entity.Goods" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<%
   List<Goods>goods = new ArrayList<>();
   goods.add(new Goods("三只松鼠","三只松鼠","好吃不上火",1));
    goods.add(new Goods("优衣库","优衣库","优衣库 服饰人身",0));
    goods.add(new Goods("小米","小米科技有限公司","为发烧而生",1));
%>

<table>
    <thead>
    <tr>
        <td>序号</td>
        <td>品牌名称</td>
        <td>企业名称</td>
        <td>品牌介绍</td>
        <td>状态</td>
        <td>操作</td>
    </tr>
    </thead>

    <tbody>
        <%
            for (int i = 0; i < goods.size(); i++) {
                Goods good = goods.get(i);
        %>
        <tr >
            <td><%=i%></td>
            <td><%=good.getBrandName()%></td>
            <td><%=good.getComName()%></td>
            <td><%=good.getIntroduction()%></td>
            <td><%=good.getStatus()%></td>
            <td>修改删除</td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>


<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>