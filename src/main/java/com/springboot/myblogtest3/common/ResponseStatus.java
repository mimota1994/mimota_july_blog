package com.springboot.myblogtest3.common;

import jdk.nashorn.internal.objects.annotations.Getter;

public enum ResponseStatus {

    CORRECT(0, "SUCCESS"),
    UPDATE_BLOG_ERROR(100, "update blog error, the database may disconect"),
    CREATE_BLOG_ERROR(101, "create blog error, the database may disconec"),
    NO_SUCH_BLOG(102, "no such blog"),
    DELETE_BLOG_ERROR(103, "delete blog error"),
    ;

    public int code;
    public String msg;

    ResponseStatus(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
