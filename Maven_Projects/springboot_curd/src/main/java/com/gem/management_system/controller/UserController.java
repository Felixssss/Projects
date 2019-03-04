package com.gem.management_system.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gem.management_system.pojo.User;
import com.gem.management_system.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }
    @RequestMapping("/show")
    public String show(HttpSession session){
        System.out.println("show");
        List<User> users=userService.show();
        for (User user : users) {
            System.out.println(user);
        }
        session.setAttribute("users", users);
        //页面：
        return "main";
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
    @RequestMapping("/detailUser")
    public String detailUser(int id,HttpSession session){
        System.out.println("id="+id);
        User user=userService.getUser(id);
        System.out.println(user);
        session.setAttribute("detailUser",user);
        return "detailUser";
    }

    /*@RequestMapping("/doDetailUser")
    public String detailUser(User user) {
        System.out.println("新的用户信息:" + user);
        userService.upUser(user);
        return "redirect:/user/show";
    }*/



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
}
