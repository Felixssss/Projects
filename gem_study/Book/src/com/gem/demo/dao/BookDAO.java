package com.gem.demo.dao;

import com.gem.demo.pojo.Book;
import java.util.List;

public interface BookDAO {
    List<Book> getAllBooks();
    Book getBook(int id);
    boolean addBook(Book book);
    boolean upBook(Book book);
    boolean delBook(int id);

}
