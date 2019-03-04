package com.gem.book_management.book.controller;

import com.gem.book_management.book.pojo.Book;
import com.gem.book_management.book.service.BookService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;
    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        return page;
    }

    @RequestMapping("/show")
    public String pageSearch(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,Model model){
        System.out.println(currentPage);
        PageInfo<Book> books = bookService.getAllUserBypay(currentPage);
        System.out.println(books);
        model.addAttribute("currBooks", books);
        return "main";
    }
    /*@RequestMapping("/show")
    public String show(HttpSession session){
        System.out.println("show");
        List<Book> books = bookService.show();
        for (Book book : books) {
            System.out.println(book);
        }
        session.setAttribute("books",books);
        return "main";
    }*/

    @RequestMapping("/del")
    public String delBook(int id){
        System.out.println("id="+id);
        bookService.delBook(id);
        return "redirect:/book/show";
    }

    @RequestMapping("/getBook")
    public String getBook(int id,HttpSession session){
        System.out.println("id="+id);
        Book book = bookService.getBook(id);
        System.out.println(book);
        session.setAttribute("upBook",book);
        return "upBook";
    }

    @RequestMapping("/detailBook")
    public String detailBook(int id,HttpSession session){
        System.out.println("id="+id);
        Book book=bookService.getBook(id);
        System.out.println(book);
        session.setAttribute("detailBook",book);
        return "detailBook";
    }

    @RequestMapping("/upBook")
    public String upBook(Book book){
        System.out.println("新书"+book);
        bookService.upBook(book);
        return "redirect:/book/show";
    }

    @RequestMapping("/addBook")
    public String addBook(){
        return "addBook";
    }
    @RequestMapping("/doAddBook")
    public String doAddUser(Book book){
        System.out.println("新增："+book);
        bookService.addBook(book);
        return "redirect:/book/show";
    }

}



