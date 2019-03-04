package com.gem.demo.servlet;

import com.gem.demo.dao.NewsDAO;
import com.gem.demo.dao.impl.NewsDAOImpl;
import com.gem.demo.pojo.News;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class MainServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        NewsDAO dao = new NewsDAOImpl();
        List<News> news = dao.getAllNews();
        HttpSession session = request.getSession();
        session.setAttribute("news", news);
        response.sendRedirect("main.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
