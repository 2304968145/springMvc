package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceImplTest {

    @Autowired
    private BookService bookService;

    @Test
    public  void  selectAllTest(){

        System.out.println(bookService.selectAll());

    }
    @Test
    public  void  selectById(){


        System.out.println( bookService.selectByid(1));
    }

    @Test
    public  void  deleteByid(){


        System.out.println(bookService.deleteById(13));

    }

    @Test
    public  void  add(){

        Book book = new Book();
        book.setDescription("这是一本测试用书");
        book.setName("测试用书");
        book.setType("测试类");

     /* bookService.add(book);*/

    }


    public void test(){


    }

}
