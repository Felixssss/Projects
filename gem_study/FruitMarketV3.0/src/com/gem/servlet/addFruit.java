package com.gem.servlet;

import com.gem.dao.FruitDAO;
import com.gem.dao.impl.FruitDAOImpl;
import com.gem.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "addFruit")
public class addFruit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        String amount = request.getParameter("amount");
        String comment = request.getParameter("comment");

        Fruit fruit = new Fruit(0,name,price,amount,comment);
        FruitDAO fruitDAO = new FruitDAOImpl();
        boolean result = fruitDAO.addFruit(fruit);
        PrintWriter out = response.getWriter();
        if(result){
            out.println("增加成功");
        }else{
            out.println("增加失败");
        }
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
