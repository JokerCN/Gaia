package com.winchampion.action.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by super on 2016/6/12.
 */
public class MainApp {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MagicBoss boss = (MagicBoss)context.getBean("magicBoss");
        MagicBoss boss2 = (MagicBoss)context.getBean("magicBoss");

        System.out.println("boss.getCar() == boss2.getCar():"+ (boss.getCar() ==boss2.getCar()));
    }


}
