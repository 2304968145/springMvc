package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    /*
    * 添加图书*/
    @Insert("insert into tb_book values(null,'${type}','${name}','${description}')")
     public int  add(Book book);


    /*按Id删除图书*/
    @Delete("delete  from tb_book where id = ${id}")
    public  int  deleteById(int id);

    /*通过id修改图书*/
    @Update("update  tb_book set type='${type}',name='${name}',description='${description}'" +
            "where  id='${id}'")
    public int updateById(Book book);


    /*查询所有图书*/
    @Select("select * from tb_book")
    public List<Book> selectAll();


    /*按Id查询图书*/
    @Select("select * from tb_book where id = ${id}")
    public Book selectByid(int id);

}
