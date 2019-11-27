package com.hhwf.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Auther: fei.wei
 * @Date: 2019/11/27 14:23
 * @Description:
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -4610060694976848283L;

    public final static Integer SUCCESS = 0;
    public final static String SUCCESS_MSG = "成功";
    public final static Integer ERROR = -1;
    public final static String ERROR_MSG = "系统错误";
    private Integer code;

    private String msg;

    private T data;

    private LocalDateTime timestamp = LocalDateTime.now();

    public Result() {
        this.code = SUCCESS;
        this.msg = SUCCESS_MSG;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T t) {
        this.code = code;
        this.msg = msg;
        this.data = t;
    }

    public Result(T t) {
        this.code = SUCCESS;
        this.msg = SUCCESS_MSG;
        this.data = t;
    }


    public static Result ok() {
        return new Result();
    }


    public static Result<Object> ok(Object t) {
        return new Result(t);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
