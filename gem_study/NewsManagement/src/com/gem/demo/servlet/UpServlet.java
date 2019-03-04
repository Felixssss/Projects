package com.gem.demo.servlet;


import com.gem.demo.dao.NewsDAO;
import com.gem.demo.dao.impl.NewsDAOImpl;
import com.gem.demo.pojo.News;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UpServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id=Integer.parseInt(request.getParameter("id"))	;

        String headline = request.getParameter("headline");
        String detail = request.getParameter("detail");
        String reporter = request.getParameter("reporter");

        News news = new News(id, headline, detail, reporter);
        System.out.println(news);
        NewsDAO newsDAO = new NewsDAOImpl();
        boolean result = newsDAO.upNews(news);

        if(result){
            //回到主页   查询最新
            response.sendRedirect("main");
        }else{
            System.out.println("修改失败");
        }

    }
}
