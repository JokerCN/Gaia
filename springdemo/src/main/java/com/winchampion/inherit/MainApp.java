package com.winchampion.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by super on 2016/6/13.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-inherit.xml");
        Car car1 = (Car)context.getBean("car1");
        System.err.println("car1: " + car1);
        Car car2 = (Car)context.getBean("car2");
        System.err.println("car2: " + car2);
    }
}
