package com.gem.servlet;

import com.gem.dao.FruitDAO;
import com.gem.dao.impl.FruitDAOImpl;
import com.gem.pojo.Fruit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "getAllServlet")
public class getAllServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //查询所有水果信息
        //调用DAO查询所有 List   响应给客户端

        FruitDAO fruitDAO = new FruitDAOImpl();
        List<Fruit> list = fruitDAO.getAllFruit();
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        out.print(list);



    }
}
