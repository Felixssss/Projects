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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form action="addBook" method="post">
  
  	书名 ：<input type="text"  name="bname"/> 
  	<br/>
  	价格 ：<input type="text"  name="price"/> 
  	<br/>
  	作者 ：<input type="text"    name="author"/> 
  	<br/>
  	简介 ：<input type="text"   name="remark"/> 
  	<br/>
  	<%-- <input type="hidden" value="${currBook.id }" name="id"> --%>
  	<input type="submit" value="确认">
  </form>
  </body>
</html>
