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
  <h2 align="center">新增新闻</h2>
  <br/>
  <div style="border:0px red solid;margin-left:30%;"><a href="mainView">首页</a></div>
  <div>
  <form action="addNews" method="post" >
	  <table align="center" width="800px" border="1px">
		  <tr>
			  <td>新闻标题</td>
			  <td><input type="text" name="headline" style="width:250px"/></td>
		  </tr>
		  <tr>
			  <td>记者</td>
			  <td><input type="text" name="reporter" style="width:250px"/></td>
		  </tr>
		  <tr>
			  <td colspan="2">
				  内容
			  </td>

		  </tr>
		  <tr>
			  <td colspan="2">
				  <textarea rows="10" cols="50" name="detail"></textarea>
			  </td>

		  </tr>
		  <tr>
			  <td colspan="2">
				  <%--<a href="javascript:sub()">确认</a>--%>
				   <input type="submit" value="确认"/>
			  </td>

		  </tr>
	  </table>
  </form>
  </div>
  </body>
</html>
