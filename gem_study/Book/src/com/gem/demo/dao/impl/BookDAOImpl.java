package com.gem.demo.dao.impl;

import com.gem.demo.dao.BaseDAO;
import com.gem.demo.dao.BookDAO;
import com.gem.demo.pojo.Book;
import com.gem.demo.util.BookParseRs;
import com.gem.demo.util.IParseRs;

import java.util.List;

public class BookDAOImpl extends BaseDAO<Book> implements BookDAO {
    IParseRs<Book> parseRs=new BookParseRs();
    @Override
    public List<Book> getAllBooks() {
        String sql="select * from books";
        return super.executeQuery(parseRs, sql);
    }

    @Override
    public Book getBook(int id) {
        String sql="select * from books where id=?";
        return super.load(parseRs, sql, id);
    }

    @Override
    public boolean addBook(Book book) {
        String sql="insert into books values(0,?,?,?,?)";
        return super.executeUpdate(sql, book.getBname(),book.getPrice(),book.getRemark(),book.getAuthor());
    }

    @Override
    public boolean upBook(Book book) {
        String sql="update books set bname=?,price=?,remark=?,author=? where id=?";
        return super.executeUpdate(sql, book.getBname(),book.getPrice(),book.getRemark(),book.getAuthor(),book.getId());
    }

    @Override
    public boolean delBook(int id) {
        String sql="delete from books where id=?";
        return super.executeUpdate(sql, id);
    }


}
