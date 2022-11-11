package com.itheima.service;

import com.itheima.domain.Book;

import java.util.List;

public interface BookService {

    /*
     * 添加图书*/

    public int  add(Book book);


    /*按Id删除图书*/

    public  int  deleteById(int id);


    /*查询所有图书*/
    public List<Book> selectAll();


    /*按Id查询图书*/
    public Book selectByid(int id);

    /*按ID修改数据*/
    public  int  updateById(Book book);
}
