<%--
  Created by IntelliJ IDEA.
  User: SGH
  Date: 2018/12/22
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
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
</head>

<script type="text/javascript">
    function sub(){
        //js
        var upForm=document.getElementById("upForm");
        upForm.submit();
    }
</script>
<style>
    a{
        color: blue;
    }
</style>
<body>
<div style="border:0px red solid; margin-left: 30%;"><a href="main.jsp">首页</a> </div>
<br/>
<form action="up" method="post" id="upForm">
    <table border="1px" width="600px" align="center">
        <c:choose>
            <c:when test="${news1 != null}">
                <tr>
                    <td>新闻</td>
                    <td><input type="text" value="${news1.headline}" name="headline" readonly="readonly" style="width:100%"/></td>
                </tr>
                <tr>
                    <td>记者</td>
                    <td><input type="text" value="${news1.reporter}" name="reporter" readonly="readonly" style="width:100%"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        内容
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <textarea rows="10" cols="30" name="detail" style="width:100%">${news1.detail} </textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="hidden" name="id" value="${news1.id}">
                        <a href="javascript:sub()">确认</a>
                    </td>
                </tr>
            </c:when>
            <c:otherwise>
                <tr>
                    <td>没有记录</td>
                </tr>
            </c:otherwise>
        </c:choose>
    </table>

</form>
</body>
</html>









