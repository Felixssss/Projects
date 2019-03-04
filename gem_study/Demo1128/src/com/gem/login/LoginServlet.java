package com.gem.login;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset = utf-8");
        response.setCharacterEncoding("utf-8");

        String name = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        if ("rose".equals(name) && "123".equals(pwd)){
            response.sendRedirect("/main");
        }else{
            PrintWriter out = response.getWriter();
            out.println("账户密码错误，重新登录！！！");
        }

/*        HttpSession session = request.getSession();
        session.setAttribute("name",name);
        session.setAttribute("pwd",pwd);

        response.sendRedirect("/session");*/



    }
    protected void doPost(){

    }
}
