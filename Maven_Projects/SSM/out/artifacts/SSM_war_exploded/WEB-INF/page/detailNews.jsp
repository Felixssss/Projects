<%--
  Created by IntelliJ IDEA.
  User: SGH
  Date: 2019/1/12
  Time: 11:02
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

    <title>My JSP 'main.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
<html>

<body>
<h2 align="center">新闻详情</h2>
<div style="border:0px red solid;margin-left:30%;"><a href="mainView">首页</a></div>
<br/>
<form action="upNews" method="post">
    <table border="1px" width="800px" align="center">
        <tr>
            <td>标题</td>
            <td ><input type="text" value="${currNews.headline}" readonly name="headline"/></td>
        </tr>
        <tr>
            <td>记者</td>
            <td><input type="text" value="${currNews.reporter}" readonly name="reporter"/></td>
        </tr>
        <tr>
            <td colspan="2">内容</td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="text" value="${currNews.detail}" readonly name="detail" style="width: 100%; height: 50px"/>
            </td>
        </tr>

    </table>
</form>

</body>
</html>
