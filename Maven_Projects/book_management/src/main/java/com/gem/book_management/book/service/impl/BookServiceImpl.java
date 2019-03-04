package com.gem.book_management.book.service.impl;

import com.gem.book_management.book.mapper.BookMapper;
import com.gem.book_management.book.pojo.Book;
import com.gem.book_management.book.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> show() {
        return bookMapper.getAllBooks();
    }

    @Override
    public void delBook(int id) {
        bookMapper.delBook(id);
    }

    @Override
    public Book getBook(int id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public void upBook(Book book) {
        bookMapper.upBook(book);
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public PageInfo<Book> getAllUserBypay(int curPage) {
        //总数
        int count = bookMapper.bookTotal();
        //分页：curpage当前页     PageUtil.pageSize
        PageHelper.startPage(curPage, 3);
        List<Book> books = bookMapper.getAllBooks();
        PageInfo<Book> pageInfo = new PageInfo<Book>(books);
        pageInfo.setPageNum(curPage);
        pageInfo.setPageSize(2);
        pageInfo.setTotal(count);

        return pageInfo;
    }


}
