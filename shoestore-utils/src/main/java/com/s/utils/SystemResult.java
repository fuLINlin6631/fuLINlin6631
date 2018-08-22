package com.s.utils;

import java.io.Serializable;

public class SystemResult implements Serializable {
    private int status=200;
    private String message;
    private Object data;

    public static SystemResult ok(Object data){
        SystemResult systemResult = new SystemResult();
        systemResult.setData(data);
        return systemResult;
    }

    public static SystemResult build(Integer status,String message){
        SystemResult systemResult = new SystemResult();
        systemResult.setStatus(status);
        systemResult.setMessage(message);
        return systemResult;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
