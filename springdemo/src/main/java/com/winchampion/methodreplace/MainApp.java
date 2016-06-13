package com.winchampion.methodreplace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by super on 2016/6/13.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Boss boss = (Boss)context.getBean("boss");
        System.err.println("boss's car: "+boss.getCar().getBrand());
    }
}
