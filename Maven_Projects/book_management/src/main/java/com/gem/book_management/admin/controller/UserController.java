package com.gem.book_management.admin.controller;

import com.gem.book_management.admin.pojo.User;
import com.gem.book_management.admin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller

public class UserController {
    @Resource
    private UserService userServiceImpl;
    @RequestMapping("/book/login")
    public String login(String username, String pwd, HttpSession session){

        User curruser=userServiceImpl.getUser(username,pwd);
        if(curruser!=null){
            //保存用户信息
            session.setAttribute("curruser", curruser);
            System.out.println("ok");
            return "redirect:/book/show";

        }else{
            System.out.println("no");
            return "login";

        }

    }





}