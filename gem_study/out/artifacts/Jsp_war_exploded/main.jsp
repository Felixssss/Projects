<%--
  Created by IntelliJ IDEA.
  User: SGH
  Date: 2018/12/19
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'main.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>
<style>
    a{
        color:#999999;
        text-decoration:none;
    }
    a:hover{
        color:#000000;
        text-decoration:underline;
    }
</style>

<body>
<div style="border:0px red solid;margin-left:30%;"><a href="add.jsp" style="color:blue">添加</a></div>
<br/>
<table width="700px" align="center" border="1px">
    <tr>
        <th>书名</th>
        <th>价格</th>
        <th>作者</th>
        <th>操作</th>

    </tr>
    <c:forEach items="${books}" var="book">

        <tr>
            <td><a href="detail?id=${book.id}">${book.bname}</a></td>
            <td>${book.price }</td>
            <td>${book.author}</td>
            <td>
                <a href="del" style="color:blue">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="up" style="color:blue">修改</a>
            </td>
        </tr>
    </c:forEach>


</table>
</body>
</html>