<%--
  Created by IntelliJ IDEA.
  User: SGH
  Date: 2018/12/24
  Time: 18:44
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
<script type="text/javascript">
    function del(id) {
        //提示框
        var result = window.confirm("确认删除");
        if (result){
            //确认按钮
            //跳转到servlet
            window.location.href = "del?id=" + id;
        }
    }
</script>
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
<div style="border:0px red solid;margin-left:10%;">
    <a href="add.jsp" style="color:blue">添加新闻</a>
</div>
<br/>
<table width="1000px" align="center" border="1px">
    <tr>
        <th>新闻标题</th>
        <th>新闻内容</th>
        <th>记者</th>
    </tr>

    <c:forEach items="${news}" var="newss">

        <tr>
            <td width="200"><a href="detail?id=${newss.id}&op=detail">${newss.headline}</a></td>
            <td width="600">${newss.detail}</td>
            <td width="80">${newss.reporter}</td>
            <td>
                <a href="javascript:del(${newss.id})" style="color:blue">新闻删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="detail?id=${newss.id}&op=up" style="color:blue">新闻编辑</a>
            </td>
        </tr>
    </c:forEach>


</table>
</body>
</html>