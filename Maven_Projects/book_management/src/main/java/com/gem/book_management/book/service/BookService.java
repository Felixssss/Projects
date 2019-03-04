package com.gem.book_management.book.service;

import com.gem.book_management.book.pojo.Book;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BookService {
    List<Book> show();
    void delBook(int id);
    Book getBook(int id);
    void upBook(Book book);
    void addBook(Book book);
    PageInfo<Book> getAllUserBypay(int curPage);

}
