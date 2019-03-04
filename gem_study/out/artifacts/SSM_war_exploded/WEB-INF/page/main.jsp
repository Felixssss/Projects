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
  	<div>
  		<a href="addBookView">添加</a>
  	</div>
   	 <table border="1px" align="center" style="width:600px" >
   	 	<tr>
   	 		<th>书名</th>
   	 		<th>价格</th>
   	 		<th>作者</th>
   	 		<th>简介</th>
   	 		<th>操作</th>
   	 		
   	 	</tr>
   	 	<c:forEach  items="${books}" var="book">
   	 	<tr>
   	 		<td>${book.bname }</td>
   	 		<td>${book.price }</td>
   	 		<td>${book.author }</td>
   	 		<td>${book.remark }</td>
   	 		<td>
   	 			<a href="delBook?id=${book.id }">删除</a>
   	 			<a href="getBook?id=${book.id }">更新</a>
   	 		</td>
   	 	</tr>
   	 	</c:forEach>
   	 </table>
  </body>
</html>
