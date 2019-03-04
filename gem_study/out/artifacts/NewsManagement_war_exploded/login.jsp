<%--
  Created by IntelliJ IDEA.
  User: SGH
  Date: 2018/12/22
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title>My JSP 'login.jsp' starting page</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <!--
  <link rel="stylesheet" type="text/css" href="styles.css">
  -->
</head>

<body>
<form action="login" method="post">
  <table align="center" width="300px" border="1px">
    <tr>
      <td>账号</td>
      <td><input type="text" name="name"/></td>
    </tr>
    <tr>
      <td>密码</td>
      <td><input type="password" name="pwd"/></td>
    </tr>
    <tr>

      <td colspan="2"><input type="submit" value="登录" width="200px" border="0px"/></td>
    </tr>
  </table>
</form>
</body>
</html>
