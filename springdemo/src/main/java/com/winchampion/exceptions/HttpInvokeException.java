package com.winchampion.exceptions;

/**
 * Created by super on 2016/6/13.
 */
public class HttpInvokeException extends RuntimeException{
    public HttpInvokeException(String url,String message){
        super("http interface unavailable ["+ url + "];" + message );
    }
}
