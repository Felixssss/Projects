package com.gem.demo.dao;

import com.gem.demo.pojo.News;
import java.util.List;

public interface NewsDAO {
    List<News> getAllNews();
    News getNews(int id);
    boolean addNews(News news);
    boolean upNews(News news);
    boolean delNews(int id);
    News findNews(String headline);
}
