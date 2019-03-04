package com.gem.demo.servlet;

import com.gem.demo.dao.BookDAO;
import com.gem.demo.dao.impl.BookDAOImpl;
import com.gem.demo.pojo.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UpServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int id=Integer.parseInt(request.getParameter("id"))	;
        String bname=request.getParameter("bname");
        String author=	request.getParameter("author");
        double price=Double.parseDouble(request.getParameter("price"));
        String remark=request.getParameter("remark");
        Book book=new Book(id, bname, price, author, remark);//新的书籍信息
        System.out.println(book);

        BookDAO bookDAO=new BookDAOImpl();
        boolean result=bookDAO.upBook(book);
        if(result){
            //回到主页   查询最新
            response.sendRedirect("main");
        }else{
            System.out.println("修改失败");
        }

    }
}
