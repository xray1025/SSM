package com.xr.service;

import com.xr.dao.BookMapper;
import com.xr.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //service层调用dao层：组合dao

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) { return bookMapper.queryBookById(id); }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Books queryBookByName(String bookName) { return bookMapper.queryBookByName(bookName); }
}
