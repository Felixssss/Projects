package com.gem.demo.servlet;

import com.gem.demo.dao.NewsDAO;
import com.gem.demo.dao.impl.NewsDAOImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        NewsDAO dao = new NewsDAOImpl();
        boolean result = dao.delNews(id);

        if(result){
            //删除成功  回到首页    显示最新所有
            response.sendRedirect("main");
        }else{
            System.out.println("删除失败");
        }
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response){

    }
}
