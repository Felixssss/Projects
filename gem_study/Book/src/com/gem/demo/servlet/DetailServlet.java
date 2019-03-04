package com.gem.demo.servlet;

import com.gem.demo.dao.BookDAO;
import com.gem.demo.dao.impl.BookDAOImpl;
import com.gem.demo.pojo.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DetailServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        BookDAO dao=new BookDAOImpl();
        Book book=dao.getBook(id);
        HttpSession session=request.getSession();
        session.setAttribute("book",book );
        String op = request.getParameter("op");
        if(op != null && op.equals("detail")){

            response.sendRedirect("detail.jsp");
        }else if(op !=null && op.equals("up")){
            //更新的请求
            response.sendRedirect("up.jsp");
        }
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
