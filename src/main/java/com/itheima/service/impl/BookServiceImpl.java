package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements com.itheima.service.BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public int add(Book book) {
        int flag;
        flag= bookDao.add(book);
        return flag;
    }

    @Override
    public int deleteById(int id) {
        int flag;
        flag= bookDao.deleteById(id);
        return flag;
    }

    @Override
    public List<Book> selectAll() {

        return  bookDao.selectAll();

    }

    @Override
    public Book selectByid(int id) {

        return bookDao.selectByid(id);
    }

    @Override
    public int updateById(Book book) {
        return  bookDao.updateById(book);
    }
}
