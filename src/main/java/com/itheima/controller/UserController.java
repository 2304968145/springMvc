package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {


    @RequestMapping("/userTest")
    @ResponseBody
    public  String test(){

        System.out.println("user save...");

        return "{'json':'jsonTest'}";
    }

    @RequestMapping("/normalParam")
    @ResponseBody
    public  String normalParam(String username,String password){

        System.out.println("normalParam: username:"+username+"password:"+password);
        return "{'username':'"+username+"','password':'"+password+"'}";
    }


    @RequestMapping("/user")
    @ResponseBody
    public  String normalParam(User user){

        System.out.println("User数据传递==>>>"+user);
        return "{'module':'user'}";
    }




    @RequestMapping("/postParam")
    @ResponseBody
    public  String postParam(String username,String password){

        System.out.println("normalParam: username:"+username+"password:"+password);
        return "{'username':'"+username+"','password':'"+password+"'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public  String arrayParam(String[] likes){

        System.out.println("likes:"+likes);
        return "{"+likes+"}";
    }

    /*使用集合来接受*/
    @RequestMapping("/listParam")
    @ResponseBody
    public  String arrayParam(@RequestParam List<String> likes){

        System.out.println("likes:"+likes);
        return "{"+likes+"}";
    }

    /*接受和转换json数据对象数组*/

    @RequestMapping("/usersForJson")
    @ResponseBody
    public  List<User> usersForJson(@RequestBody List<User> users){

        System.out.println(users);

        return  users;
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getRestById(@PathVariable Integer id){

        System.out.println("GETREST Param:"+id);
        return "{'module':'GETRestWithID'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String getRest(){

        System.out.println("GETREST NO Param:");
        return "{'module':'GETRestNOId'}";
    }

}
