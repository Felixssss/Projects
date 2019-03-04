<%--
  Created by IntelliJ IDEA.
  User: SGH
  Date: 2018/12/22
  Time: 11:38
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

    <title>My JSP 'add.jsp' starting page</title>

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
    function sub(){
        //js
        var addForm=document.getElementById("addForm");
        addForm.submit();
    }
</script>
<style>
    a{
        color:blue;
    }
</style>
<body>
<div style="border:0px red solid;margin-left:30%;"><a href="main.jsp">首页</a></div>
<form action="add" method="post" id="addForm">
    <table align="center" width="300px" border="1px">
        <tr>
            <td>书名</td>
            <td><input type="text" name="bname" style="width:250px"/></td>
        </tr>
        <tr>
            <td>作者</td>
            <td><input type="text" name="author" style="width:250px"/></td>
        </tr>
        <tr>
            <td>价格</td>
            <td><input type="text" name="price" style="width:250px"/></td>
        </tr>
        <tr>
            <td colspan="2">
                简介
            </td>

        </tr>
        <tr>
            <td colspan="2">
                <textarea rows="10" cols="50" name="remark"></textarea>
            </td>

        </tr>
        <tr>
            <td colspan="2">
                <a href="javascript:sub()">确认</a>
                <!-- <input type="submit" value="确认"/> -->
            </td>

        </tr>
    </table>

</form>
</body>
</html>
