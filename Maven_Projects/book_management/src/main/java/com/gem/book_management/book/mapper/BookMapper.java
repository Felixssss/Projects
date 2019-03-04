package com.gem.book_management.book.mapper;

import com.gem.book_management.book.pojo.Book;

import java.util.List;

public interface BookMapper {
    List<Book> getAllBooks();
    void delBook(int id);
    Book getBookById(int id);
    void upBook(Book book);
    void addBook(Book book);
    int bookTotal();
}
