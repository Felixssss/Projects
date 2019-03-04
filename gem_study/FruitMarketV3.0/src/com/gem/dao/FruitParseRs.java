package com.gem.dao;

import com.gem.pojo.Fruit;
import com.gem.util.IParseRs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FruitParseRs implements IParseRs<Fruit>{
    //解析水果信息
    public List<Fruit> parseRs(ResultSet rs){
        List<Fruit> list = new ArrayList<>();

        try {
            while(rs.next()) {
                int id = rs.getInt(1);
                String fruitname = rs.getString(2);
                double price = rs.getDouble(3);
                String amount = rs.getString(4);
                String comment = rs.getString(5);

                Fruit fruit = new Fruit(id, fruitname, price, amount, comment);
                list.add(fruit);
            }
            return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
