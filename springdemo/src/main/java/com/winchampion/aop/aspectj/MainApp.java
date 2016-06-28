package com.winchampion.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by super on 2016/6/28.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-aspectj-beans.xml");
        Waiter waiter = context.getBean("waiter",Waiter.class);
        waiter.greetTo("John");
        waiter.serveTo("John");
    }
}
