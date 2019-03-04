package com.gem.springboottest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gem.springboottest.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginController {

	//登陆请求  账号 密码 为 rose  ok时登陆成功   ，否则返回登录页
	@RequestMapping("/login") 
	public String login(String username,String pwd, HttpServletRequest request){
		HttpSession session=request.getSession();
		System.out.println(username+"++"+pwd);
		if(("rose").equals(username)&&("ok").equals(pwd)){
			User user=new User(0, username, 0);
			session.setAttribute("currUser", user);
			return "redirect:/user/show";
		}else{
			return "html/login";
		}
	
	}
	
}
