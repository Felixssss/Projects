package com.gem.news.system.admin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.gem.news.system.admin.pojo.User;
import com.gem.news.system.admin.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userServiceImpl;
	@RequestMapping("login")
	public String login(String username,String pwd,HttpSession session){
		
		User curruser=userServiceImpl.getUser(username,pwd);
		if(curruser!=null){
			//保存用户信息
			session.setAttribute("curruser", curruser);
			return "redirect:showNews";
			
		}else{
			
			return "redirect:login";
		}
	}
	
	
	
	
	
}
