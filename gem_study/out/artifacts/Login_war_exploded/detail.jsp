<%--
  Created by IntelliJ IDEA.
  User: SGH
  Date: 2018/12/19
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'detail.jsp' starting page</title>

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
        color:blue;
    }
</style>
<body>
<div style="border:0px red solid;margin-left:30%;"><a href="main.jsp">首页</a></div>
<br/>
<table border="1px" width="500px" align="center">
    <c:choose>

        <c:when test="${book!=null}">
            <tr>
                <td>书名</td>
                <td>${book.bname}</td>
            </tr>
            <tr>
                <td>作者</td>
                <td>${book.author}</td>
            </tr>
            <tr>
                <td>价格</td>
                <td>${book.price}</td>
            </tr>
            <tr>
                <td colspan="2">${book.remark}</td>
            </tr>


        </c:when>
        <c:otherwise>
            <tr>
                <td>该书没有记录</td>
            </tr>
        </c:otherwise>
    </c:choose>



</table>
</body>
</html>