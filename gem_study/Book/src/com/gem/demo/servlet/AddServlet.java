package com.gem.demo.servlet;

import com.gem.demo.dao.BookDAO;
import com.gem.demo.dao.impl.BookDAOImpl;
import com.gem.demo.pojo.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String bname=request.getParameter("bname");
        String author=request.getParameter("author");
        double price=Double.parseDouble(request.getParameter("price"));
        String remark=request.getParameter("remark");
        Book book=new Book(0, bname, price, author, remark);
        System.out.println(book);

        BookDAO dao=new BookDAOImpl();
        boolean result=dao.addBook(book);
        if(result){
            //添加成功  回到首页   显示最新所有
            response.sendRedirect("main");

        }else{
            System.out.println("添加失败");
        }
    }
}
