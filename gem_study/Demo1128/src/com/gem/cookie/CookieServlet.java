package com.gem.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CookieServlet")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset = utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Cookie[] cookies = request.getCookies();

        if (cookies != null){
            out.println("你上次登录的时间为:");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if(cookie.getName().equals("lasttime")){
                    long time = Long.parseLong(cookie.getValue());
                 //   Date date = new Date(time);


                    out.println(sdf.format(time));
                    break;
                }
            }
        }else {
            out.println("第一次的登录时间为：" + System.currentTimeMillis());
        }
        Cookie cookie = new Cookie("lasttime","" + System.currentTimeMillis());
        response.addCookie(cookie);

    }
}
