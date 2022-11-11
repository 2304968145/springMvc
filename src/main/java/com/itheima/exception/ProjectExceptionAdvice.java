package com.itheima.exception;

import com.itheima.controller.Result;
import com.itheima.until.Code;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(BussinessException.class)
    public Result dobussinessException(BussinessException e){

        return new Result(e.getCode(),null,e.getMessage());
    }


    @ExceptionHandler(SystemEXception.class)
    public  Result doSystemException(SystemEXception e){


        /*记录日志，
            联系运维，
          发邮件给开发者，
          安抚用户
        * */

        return new Result(e.getCode(),null,e.getMessage());
    }

    /*用于处理未知异常*/
    @ExceptionHandler(Exception.class)
    public Result UnknowException(Exception e){
        /*记录日志，
         联系运维，
        发邮件给开发者，
       安抚用户
        * */
        return new Result(Code.UNKNOW_EXCEPTION,null,"系统繁忙，请稍后再试！");

    }

}
