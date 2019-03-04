package com.gem.demo.servlet;

import com.gem.demo.dao.NewsDAO;
import com.gem.demo.dao.impl.NewsDAOImpl;
import com.gem.demo.pojo.News;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DetailServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        NewsDAO dao = new NewsDAOImpl();
        News news1 = dao.getNews(id);

        HttpSession session=request.getSession();
        session.setAttribute("news1",news1 );
        String op = request.getParameter("op");
        if(op != null && op.equals("detail")){

            response.sendRedirect("detail.jsp");
        }else if(op !=null && op.equals("up")){
            //更新的请求
            response.sendRedirect("up.jsp");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }

}
