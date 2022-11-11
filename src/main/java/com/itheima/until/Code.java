package com.itheima.until;

public class Code {


    /*数据查询结果状态码*/
    public static final Integer  ADD_OK = 20011;
    public static final Integer  DELETE_OK = 20021;
    public static final Integer  UPDATE_OK = 20031;
    public static final Integer  GET_ID_OK = 20041;
    public static final Integer  GET_ALL_OK = 20051;
    public static final Integer  ADD_ERROR =    20010;
    public static final Integer  DELETE_ERROR = 20020;
    public static final Integer  UPDATE_ERROR = 20030;
    public static final Integer  GET_ID_ERROR = 20040;
    public static final Integer  GET_ALL_ERROR = 20050;



    /*异常发生状态码*/

    public static  final  Integer SYSTEM_EXCEPTION = 50000;

    public static  final  Integer BUSSINESS_EXCEPTION = 50001;

    public static  final  Integer UNKNOW_EXCEPTION = 59999;
}
