package com.gem.film_management.controller;


import com.gem.film_management.pojo.Film;
import com.gem.film_management.pojo.Order;
import com.gem.film_management.pojo.User;
import com.gem.film_management.service.FilmService;
import com.gem.film_management.service.OrderService;
import com.gem.film_management.service.UserService;
import com.gem.film_management.time.Time;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/web")
public class WebController {

    @Resource
    private FilmService filmService;
    @Resource
    private OrderService orderService;
    @Resource
    private Time time;
    @Resource
    private UserService userService;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("/show")
    public String web_pageSearch(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,HttpSession session) {
      //  flag  ===  page
        if(currentPage==0){
            currentPage=1;
        }
        PageInfo<Film> films = filmService.getAll(currentPage);
        session.setAttribute("currFilm", films);

       // String film_name=(String)session.getAttribute("searchFilm");
            /*if(film_name!=null){
                if(currentPage==0){
                    currentPage=1;
                }
                PageInfo<Film> films = filmService.searchAll(currentPage,film_name);
                session.setAttribute("currFilm", films);

            }else{
                if(currentPage==0){
                    currentPage=1;
                }
                PageInfo<Film> films = filmService.getAll(currentPage);
                session.setAttribute("currFilm", films);
            }*/

             return "web_homepage";
    }


    @RequestMapping("/search")
    public String search(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,String film_name, HttpSession session){
        if(currentPage==0){
            currentPage=1;
        }

        PageInfo<Film> film = filmService.searchAll(currentPage,film_name);
       // session.setAttribute("searchFilm",film_name);
        session.setAttribute("currFilm", film);
        System.out.println(film);
        return "web_homepage";
    }

    @RequestMapping("/searchType")
    public String searchType(String film_type, HttpSession session){

        List<Film> searchType = filmService.searchType(film_type);
        session.setAttribute("currFilm",searchType);

        System.out.println(searchType);
        return "web_homeType";
    }




    @RequestMapping("/detailFilm")
    public String detailFilm(int id, HttpSession session){
        Film film = filmService.getFilm(id);
        session.setAttribute("detailFilm", film);
        return "web_detail";
    }

    @RequestMapping("/detail")
        public String web_pageSearch1(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, Model model) {
            //System.out.println(currentPage);
            PageInfo<Film> films = filmService.getAll(currentPage);
            model.addAttribute("currFilm", films);
            return "web_detail";
    }

    @RequestMapping("/order")
    public String addOrder(int uid, int fid, int film_number, HttpSession session){
        Film film = filmService.getFilm(fid);
        User user = userService.getUserById(uid);

        String film_name = film.getFilm_name();
        double film_price = film.getFilm_price();
        String film_start = film.getFilm_start();
        String film_end = film.getFilm_end();
        String order_time = time.getTime();
        String user_name = user.getName();

        Order order = new Order(0,fid,uid,film_name,film_price,film_start,film_end,order_time,film_number,user_name);
        orderService.addOrder(order);
        Order order1 = orderService.getOrder(order_time);
        session.setAttribute("orders", order1);

        //计算总价
       /* double countMoney=film_number*film_price;
        double d = 114.145;*/
        double countMoney = (double) Math.round(film_number*film_price * 100) / 100;
        //System.out.println(countMoney);
        session.setAttribute("countMoney",countMoney);
        return "web_sale";
    }

    @RequestMapping("/personal")
    public String personal(Integer uid, HttpSession session){

        List<Order> personal = orderService.getOrderByUid(uid);
        System.out.println(personal);
        session.setAttribute("personalOrder",personal);
        return "web_personal";
    }

    @RequestMapping("/signIn")
    public String signIn(){

        return "web_signIn";
    }

    @RequestMapping("/addSignIn")
    public String addSignIn(User user, String name, HttpSession session){
        int count = userService.checkUserName(name);

        if(count != 0){
            System.out.println("用户名重复");
            return "redirect:/web/signIn";
        }else {
            session.setAttribute("user", user);
            userService.addUser(user);
            try{
                Thread.sleep(2600);
            }catch(Exception e){
                System.exit(0);//退出程序
            }
            return "redirect:/film/login";
        }
    }


    @RequestMapping("/delOrder")
    public String delOrder(Integer id,Integer uid, HttpSession session){

        orderService.delOrder(id);
        List<Order> personal = orderService.getOrderByUid(uid);
        System.out.println(personal);
        session.setAttribute("personalOrder",personal);
        return "web_personal";

    }

}
