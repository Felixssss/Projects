package com.gem.springboottest.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gem.springboottest.pojo.User;
import com.gem.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gem.springboottest.pojo.Result;

@Controller
@RequestMapping("/user")
public class UserController {
	 @Value("${web.upload-path}")
	 private String path;
	@Resource
	private UserService userService;
	@RequestMapping("/{page}")
	public String page(@PathVariable String page){
		System.out.println(page);
		return page;
	}
	
	
	@RequestMapping("/show")//  8080/../login.html
	public String show(HttpSession session){
		
		//查询所有用户
		List<User> users=userService.show();
		for (User user : users) {
			System.out.println(user);
		}
		session.setAttribute("users", users);
		return "/html/main";
	}
	@RequestMapping("/del")
	public String delUser(int id){
		System.out.println("id="+id);
		userService.delUser(id);
		return "redirect:/user/show";
	}
	@RequestMapping("/getUser")
	public String getUser(int id,HttpSession session){
		System.out.println("id="+id);
		User user=userService.getUser(id);
		System.out.println(user);
		session.setAttribute("upUser",user);
		return "upUser";
	}
	@RequestMapping("/upUser")
	public String upUser(User user){
		System.out.println("新的用户信息:"+user);
		userService.upUser(user);
		return "redirect:/user/show";
	}
	@RequestMapping("/addUser")
	public String addUser(){
		return "addUser";
	}
	@RequestMapping("/doAddUser")
	public String doAddUser(User user){
		System.out.println("新增："+user);
		userService.addUser(user);
		return "redirect:/user/show";
	}
	@RequestMapping("/test")
	public String test(Model model)
	{
		model.addAttribute("gender", "女");
		model.addAttribute("address", "浙江");
		
	
		return "/html/test";
	}
	
	@RequestMapping("/uploadPage")
	public String uploadPage(){
		System.out.println("upload....");
		return "/html/upload";
	}
	@RequestMapping("/upload")
	@ResponseBody
	public Result upload(MultipartFile file,HttpServletRequest request,HttpSession session) throws Exception{
		//获取文件名
		String picname=file.getOriginalFilename();
		//上传
		System.out.println(picname);
		System.out.println("----------");
		System.out.println(path);
		
		file.transferTo(new File(path+"/"+file.getOriginalFilename()));
		
		//前端插件要求返回Result结果  json  @ResponseBody
		Result result=new Result(200, path+"/"+picname);
		//保存
    	session.setAttribute("picname",picname );
		return result;
	}
	
	@RequestMapping("/showpic")
	public String showpic(){
		System.out.println("showpic....");
		return "/html/showpic";
	}
	
}
