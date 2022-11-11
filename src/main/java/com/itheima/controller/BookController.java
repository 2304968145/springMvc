package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.exception.BussinessException;
import com.itheima.service.BookService;
import com.itheima.until.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    /*
     * 添加图书*/

    @PostMapping
    public Result  add(@RequestBody Book book){

        int flag =bookService.add(book);

         return  new Result(flag>0? Code.ADD_OK:Code.ADD_ERROR,flag);

    }


    /*按Id删除图书*/
    @DeleteMapping("/{id}")
    public  Result  deleteById(@PathVariable int id){

        if (id<=0){throw new BussinessException(Code.BUSSINESS_EXCEPTION,"请不要用你的之上来挑战我的技术！");
        }

            int flag=bookService.deleteById(id);

        return new Result(flag>0?Code.DELETE_OK:Code.DELETE_ERROR,flag);
    }

    /*查询所有图书*/
    @GetMapping
    public Result selectAll(){

        List<Book> books =bookService.selectAll();
        Integer code = books!=null?Code.GET_ALL_OK:Code.GET_ALL_ERROR;
        String msg = books!=null?"":"查询失败";
        return new  Result(code,books,msg);

    }

    @GetMapping ("/{id}")
    /*按Id查询图书*/
    public Result selectByid(@PathVariable int id){

        Book book = bookService.selectByid(id);
        Integer code = book!=null?Code.GET_ID_OK:Code.GET_ID_ERROR;
        String msg = book!=null?"":"数据查询失败，请重试";

        return new Result(code,book,msg);
    }

    @PutMapping
    /*虽然是按ID修改数据，实际前端传过来的应该是一整套JSON数据.
    * */
    public Result updateById(@RequestBody Book book)
    {
       int flag = bookService.updateById(book);
       /*如果这里不写提示消息，那么在前端就要写，一般是从后端这里获取*/
        Integer code =flag==1?Code.UPDATE_OK:Code.UPDATE_ERROR;
        String msg = flag ==1?"修改成功":"修改失败";

       return new Result(code,flag,msg);
    }
}

