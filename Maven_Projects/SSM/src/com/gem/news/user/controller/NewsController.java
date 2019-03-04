package com.gem.news.user.controller;

import com.gem.news.user.pojo.News;
import com.gem.news.user.service.impl.NewsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class NewsController {
	@Resource
	private NewsServiceImpl newsServiceImpl;
	@RequestMapping("showNews")
	public String showNews(HttpSession session){

		List<News> news=newsServiceImpl.getAllNews();
		session.setAttribute("news", news);
		for (News newss : news) {
			System.out.println(newss);
		}
		return "main";
	}
	
	@RequestMapping("delNews")
	public String delNews(int id){
		newsServiceImpl.delNews(id);
		//查新最新信息
		return "redirect:showNews";
	}
	
	@RequestMapping("getNews")
	public String getNews(int id,HttpSession session){
		News currNews=newsServiceImpl.getNewsById(id);
		session.setAttribute("currNews", currNews);
		return "upNews";
	}

	@RequestMapping("detailNews")
	public String detailNews(int id,HttpSession session){
		News currNews=newsServiceImpl.getNewsById(id);
		session.setAttribute("currNews", currNews);
		return "detailNews";
	}

	@RequestMapping("upNews")
	public String upNews(News news){
		System.out.println(news);
		newsServiceImpl.upNews(news);
		return "redirect:showNews";
		
	}
	
	@RequestMapping("addNews")
	public String addNews(News news){
		newsServiceImpl.addNews(news);
		return "redirect:showNews";
	}
	//跳转到添加页面
	@RequestMapping("addNewsView")
	public String addNewsView(){
		return "addNews";
	}

	@RequestMapping("mainView")
	public String mainNewsView(){
		return "main";
	}

}
