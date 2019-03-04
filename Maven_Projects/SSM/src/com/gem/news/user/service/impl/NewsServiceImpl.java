package com.gem.news.user.service.impl;

import com.gem.news.user.mapper.NewsMapper;
import com.gem.news.user.pojo.News;
import com.gem.news.user.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
	@Resource
	private NewsMapper newsMapper;


	@Override
	public List<News> getAllNews() {
		return newsMapper.getAllNews();
	}

	@Override
	public boolean delNews(int id) {
		return newsMapper.delNews(id);
	}

	@Override
	public News getNewsById(int id) {
		return newsMapper.getNewsById(id);
	}

	@Override
	public boolean upNews(News news) {
		return newsMapper.upNews(news);
	}

	@Override
	public boolean addNews(News news) {
		return newsMapper.addNews(news);
	}
}
