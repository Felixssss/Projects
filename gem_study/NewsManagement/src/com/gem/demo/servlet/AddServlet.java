package com.gem.demo.servlet;


import com.gem.demo.dao.NewsDAO;
import com.gem.demo.dao.impl.NewsDAOImpl;
import com.gem.demo.pojo.News;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




        String headline = request.getParameter("headline");
        String detail = request.getParameter("detail");
        String reporter = request.getParameter("reporter");

        News news = new News(0, headline, detail, reporter);
        System.out.println(news);

        NewsDAO dao = new NewsDAOImpl();
        boolean result = dao.addNews(news);

        if(result){
            //添加成功  回到首页   显示最新所有
            response.sendRedirect("main");

        }else{
            System.out.println("添加失败");
        }
    }
}
