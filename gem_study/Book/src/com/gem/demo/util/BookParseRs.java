package com.gem.demo.util;

import com.gem.demo.pojo.Book;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookParseRs implements IParseRs<Book>{

    @Override
    public List<Book> parseRS(ResultSet rs){
        List<Book> list = new ArrayList<Book>();
        try{
            while (rs.next()){
                int id = rs.getInt(1);
                String bname = rs.getString(2);
                double price = rs.getDouble(3);
                String remark = rs.getString(4);
                String author = rs.getString(5);

                Book book = new Book(id, bname, price, author, remark);
                list.add(book);
            }
            return list;

        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
