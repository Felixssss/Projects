package com.gem.demo.util;

import com.gem.demo.pojo.News;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsParseRs implements IParseRs<News>{

    @Override
    public List<News> parseRS(ResultSet rs) {
        List<News> list = new ArrayList<News>();
        try{
            while (rs.next()){
                int id = rs.getInt(1);
                String headline = rs.getString(2);
                String detail = rs.getString(3);
                String reporter = rs.getString(4);
                News news = new News(id, headline, detail, reporter);
                list.add(news);
            }
            return list;

        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

    }
        return null;
    }
}
