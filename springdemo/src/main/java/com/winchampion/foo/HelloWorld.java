package com.winchampion.foo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by super on 2016/6/3.
 */
public class HelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("Message"+message);
    }
    @PostConstruct
    public void init(){
        System.err.println("Bean is going through init.");
    }
    @PreDestroy
    public void destroy(){
        System.err.println("Bean is going through destroy");
    }
}
