package com.gem.demo.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){

    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        if("rose".equals(uname) && "123".equals(pwd)){
            response.sendRedirect("main");
        }else{
            response.sendRedirect("login.jsp");
        }

    }
}
