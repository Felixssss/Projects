package com.gem.news.user.mapper;

import com.gem.news.user.pojo.News;

import java.util.List;

public interface NewsMapper {
    List<News> getAllNews();
    boolean delNews(int id);
    boolean addNews(News news);
    boolean upNews(News news);
    News getNewsById(int id);
}
