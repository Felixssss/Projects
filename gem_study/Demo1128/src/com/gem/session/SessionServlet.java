package com.gem.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        //session.invalidate();
        String name = (String)session.getAttribute("name");
        System.out.println(name);
        String pwd = (String)session.getAttribute("pwd");
        System.out.println(name + "》》》" + pwd);
        PrintWriter out = response.getWriter();
        out.println(name);
        out.println(pwd);
    }
}
