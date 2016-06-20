package com.winchampion.aop.staticmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-staticmethod-beans.xml");
        Waiter waiter = context.getBean("waiter2",Waiter.class);
        waiter.greetTo("John");
        waiter.greetTo("Tom");
        waiter.greetTo("Harry Potter");
    }
}
