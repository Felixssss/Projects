package com.gem.film_management.controller;


import com.gem.film_management.pojo.Film;
import com.gem.film_management.pojo.Pic;
import com.gem.film_management.service.FilmService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Value("${web.upload-path}")
    private String path;
    @Resource
    private FilmService filmService;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("/show")
    public String pageSearch( HttpSession session){
        List<Film> films = filmService.show();
        session.setAttribute ("currFilm", films);
        return "film_list";
    }

    @RequestMapping("/getFilm")
    public String getFilm(int id, HttpSession session){
        Film film = filmService.getFilm(id);
        session.setAttribute("getFilm",film);

        return "film_edit";
    }

    @RequestMapping("/upFilm")
    public String upFilm(Film film, HttpSession session){
        /*String pic = (String) session.getAttribute("picname");
        String film_name = film.getFilm_name();
        String film_type = film.getFilm_type();
        String film_introduce = film.getFilm_introduce();
        Double film_price = film.getFilm_price();
        String film_start = film.getFilm_start();
        String film_end = film.getFilm_end();

        if(pic == null){
            Film film1 = new Film(0,film_name,null,film_type,film_introduce,film_price,film_start,film_end);
            filmService.upFilm(film1);
        }else {

            film.setFilm_pic((String) session.getAttribute("picname"));
            filmService.upFilm(film);
        }*/
        film.setFilm_pic((String) session.getAttribute("picname"));
        filmService.upFilm(film);

        return "redirect:/admin/show";
    }

    @RequestMapping("/delFilm")
    public String delFilm(int id){
        filmService.delFilm(id);
        return "redirect:/admin/show";
    }

    @RequestMapping("addFilm")
    public String addFilm(){
        return "film_add";
    }

    @RequestMapping("/doAddFilm")
    public String doAddFilm(Film film ,HttpSession session){
        film.setFilm_pic((String) session.getAttribute("picname"));
        filmService.addFilm(film);
        return "redirect:/admin/show";
    }

    //上传图片
    @RequestMapping("/uploadPage")
    public String uploadPage(){
        System.out.println("upload....");
        return "/admin/upload";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public Pic upload(MultipartFile file, HttpServletRequest request, HttpSession session) throws IOException {
        //获取文件名
        String picname=file.getOriginalFilename();
        //上传
        System.out.println(picname);
        System.out.println("----------");
        System.out.println(path);

        file.transferTo(new File(path+"/"+file.getOriginalFilename()));

        //前端插件要求返回Result结果  json  @ResponseBody
        Pic result=new Pic(200, path+"/"+picname);
        //保存
        session.setAttribute("picname",picname );
        return result;
    }

    @RequestMapping("/showpic")
    public String showpic(){
        System.out.println("showpic....");
        return "/admin/showpic";
    }


}





