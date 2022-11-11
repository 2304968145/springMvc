package com.itheima.exception;

public class BussinessException extends RuntimeException{

    private  Integer code;

    public BussinessException() {
        super();
    }

    public BussinessException(Integer code,String message) {
        super(message);
        this.code=code;
    }

    public BussinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BussinessException(Throwable cause) {
        super(cause);
    }

    protected BussinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * 获取
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    public String toString() {
        return "BussinessException{code = " + code + "}";
    }
}
