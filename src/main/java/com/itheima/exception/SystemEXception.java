package com.itheima.exception;

public class SystemEXception extends RuntimeException{

    private  Integer code;

    public SystemEXception() {
        super();
    }

    public SystemEXception(Integer code,String message) {
        super(message);
        this.code=code;
    }

    public SystemEXception(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code =code;
    }

    public Integer getCode() {
        return code;
    }
}
