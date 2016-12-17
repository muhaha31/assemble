package com.zwstech.domain;

/**
 * Created by wutairui on 2016/12/15.
 */
public class DataWrapper<T> {

    public static final Integer OK = 0;
    public static final Integer ERROR = 100;


    public DataWrapper() {
    }

    public DataWrapper(T data) {
        this.code = OK;
        this.message = "";
        this.url = "";
        this.data = data;
    }

    public DataWrapper(Integer code, String message, String url, T data) {
        this.code = code;
        this.message = message;
        this.url = url;
        this.data = data;
    }

    private Integer code;
    private String message;
    private String url;
    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
