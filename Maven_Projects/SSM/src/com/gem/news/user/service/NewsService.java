package com.gem.news.user.service;

import com.gem.news.user.pojo.News;

import java.util.List;

public interface NewsService {
    List<News> getAllNews();
    boolean delNews(int id);
    News getNewsById(int id);
    boolean upNews(News news);
    boolean addNews(News news);

}
