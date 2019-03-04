package com.gem.demo.dao.impl;

import com.gem.demo.dao.BaseDAO;
import com.gem.demo.dao.NewsDAO;
import com.gem.demo.pojo.News;
import com.gem.demo.util.IParseRs;
import com.gem.demo.util.NewsParseRs;

import java.util.List;

public class NewsDAOImpl extends BaseDAO<News> implements NewsDAO {
    IParseRs<News> parseRs = new NewsParseRs();

    @Override
    public List<News> getAllNews() {
        String sql="select * from news";
        return super.executeQuery(parseRs, sql);
    }

    @Override
    public News getNews(int id) {
        String sql="select * from news where id=?";
        return super.load(parseRs, sql, id);
    }

    @Override
    public boolean addNews(News news) {
        String sql="insert into news values(0,?,?,?)";
        return super.executeUpdate(sql, news.getHeadline(), news.getDetail(), news.getReporter());
    }

    @Override
    public boolean upNews(News news) {
        String sql="update news set headline=?,detail=?,reporter=? where id=?";
        return super.executeUpdate(sql, news.getHeadline(), news.getDetail(), news.getReporter(), news.getId());
    }

    @Override
    public boolean delNews(int id) {
        String sql="delete from news where id=?";
        return super.executeUpdate(sql, id);
    }

    @Override
    public News findNews(String headline) {
        String sql="select * from news where headline=?";
        return super.load(parseRs, sql, headline);
    }
}
