package com.gem.context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebServlet(name = "ServletContext")
public class ServletContext extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String value = request.getServletContext().getInitParameter("user");
        System.out.println(value);*/
        /*InputStream is = this.getServletContext().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(is);
        String uservalue = properties.getProperty("user");
        String pwdvalue = properties.getProperty("pwd");
        System.out.println("user --> " + uservalue + "pwd --> " + pwdvalue);*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String value = request.getServletContext().getInitParameter("user");
        System.out.println(value);*/
        InputStream is = this.getServletContext().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(is);
        String uservalue = properties.getProperty("user");
        String pwdvalue = properties.getProperty("pwd");
        System.out.println("user --> " + uservalue + "pwd --> " + pwdvalue);
    }
}
