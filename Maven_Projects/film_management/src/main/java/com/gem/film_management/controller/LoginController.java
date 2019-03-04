package com.gem.film_management.controller;

import com.gem.film_management.pojo.User;
import com.gem.film_management.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/film")
public class LoginController {

    @Resource
    private UserService userServiceImpl;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        return page;
    }

    @RequestMapping("/login")
    public String login(String name, String pwd, String type, HttpSession session) {

        User curruser = userServiceImpl.getUser(name, pwd, type);
        if(curruser!=null){
            if (curruser.getType().equals("admin")) {
                session.setAttribute("curruser", curruser);
                return "redirect:/admin/show";

            } else if (curruser.getType().equals("user")) {
                session.setAttribute("curruser", curruser);
                return "redirect:/web/show";
            }
            return "";

        }else{
            //System.out.println("no");
            return "login";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        String sessionuser;
        sessionuser = null;
        session.setAttribute("curruser",sessionuser);
        session.setAttribute("curruser",sessionuser);
        return "login";
    }

}
