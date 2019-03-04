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
import java.util.List;

@WebServlet(name = "selectFruit")
public class selectFruit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        FruitDAO fruit = new FruitDAOImpl();
        String op = request.getParameter("op");
        PrintWriter out = response.getWriter();

        if (op != null &&"fname".equals(op)){
            String fname = request.getParameter("fname");
            String name = new String(fname.getBytes("iso-8859-1"),"utf-8");
            Fruit f = fruit.findFruitName(name);
            if (f != null){
                System.out.println(f);
                out.println(f);
            }else{
                out.println("没有找到！！！");
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //水果名字查询
        String op = request.getParameter("op");
        FruitDAO fruitDAO = new FruitDAOImpl();
        //设定编码
        response.setCharacterEncoding("utf-8");
        //获取响应流
        PrintWriter out = response.getWriter();

        if(op != null && "fname".equals(op)){
            String fname = request.getParameter("fname");
            List<Fruit> f = fruitDAO.findFruitByName(fname);
            if(f != null && f.size() > 0){
                System.out.println(f);
                out.println(f);
            }else{
                out.println("没有该员工");
            }
        }
    }
}
