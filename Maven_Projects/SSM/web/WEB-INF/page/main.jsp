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
  <h2 align="center">新闻管理系统</h2>
  	<div>
  		<a href="addNewsView" style="margin-left: 30%">添加新闻</a>
  	</div>
   	 <table border="1px" align="center" width="800px" >
   	 	<tr>
   	 		<th>标题</th>
   	 		<th>内容</th>
   	 		<th>记者</th>
   	 		<th>操作</th>
   	 		
   	 	</tr>
   	 	<c:forEach  items="${news}" var="news">
   	 	<tr>
   	 		<td><a href="detailNews?id=${news.id}">${news.headline}</a></td>
   	 		<td>${news.detail}</td>
   	 		<td>${news.reporter}</td>
   	 		<td width="80px">
   	 			<a href="delNews?id=${news.id }">删除新闻</a>
				<br/>
   	 			<a href="getNews?id=${news.id }">更新新闻</a>
   	 		</td>
   	 	</tr>
   	 	</c:forEach>
   	 </table>
  </body>
</html>
