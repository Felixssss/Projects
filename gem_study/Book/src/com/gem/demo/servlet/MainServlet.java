package com.gem.demo.servlet;

import com.gem.demo.dao.BookDAO;
import com.gem.demo.dao.impl.BookDAOImpl;
import com.gem.demo.pojo.Book;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class MainServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BookDAO dao = new BookDAOImpl();
        List<Book> books = dao.getAllBooks();
        HttpSession session = request.getSession();
        session.setAttribute("books", books);
        response.sendRedirect("main.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
