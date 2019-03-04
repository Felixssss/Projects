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

@WebServlet(name = "delFruit")
public class delFruit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String fruit = request.getParameter("fruit");

        FruitDAO fruitDAO = new FruitDAOImpl();
        PrintWriter out = response.getWriter();

        Fruit f = fruitDAO.findFruitName(fruit);

        if(f != null){
            boolean result = fruitDAO.delFruit(f);
            if(result){
                out.println("删除成功");
            }else{
                out.println("删除失败");
            }
        }else{
            out.println("没有该水果");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 /*       request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String fruit = request.getParameter("fruit");
       // String name = new String(fruit.getBytes("iso-8859-1"),"utf-8");
        FruitDAO fruitDAO = new FruitDAOImpl();
        Fruit f = fruitDAO.findFruitName(fruit);

        System.out.println(f);
        if(f != null){
            boolean result = fruitDAO.delFruit(f);
            if(result){
                out.println("删除成功");
            }else{
                out.println("删除失败");
            }
        }else{
            out.println("没有该水果");
        }*/
    }
}
