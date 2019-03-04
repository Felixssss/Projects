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

@WebServlet(name = "upFruit")
public class upFruit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        FruitDAO fruitDAO = new FruitDAOImpl();
        String name = request.getParameter("name");
        Fruit fruit = fruitDAO.findFruitName(name);

        if (fruit != null) {
            out.println(fruit);
            //out.println("请继续输入价格,数量,备注");
            double price = Double.valueOf(request.getParameter("price"));
            String amount = request.getParameter("amount");
            String comment = request.getParameter("comment");
            Fruit newfruit = new Fruit(fruit.getId(), name, price, amount, comment);
            boolean result = fruitDAO.upFruit(newfruit);
            if(result){
                out.println("修改成功");
            }else{
                out.println("修改失败");
            }
        }else{
            out.println("没有该水果");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
