package com.winchampion.aop.staticmethod;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class Waiter {
    public void greetTo(String name){
        System.out.println("waiter greet to " + name + "...");
    }
    public void serveTo(String name){
        System.out.println("seller greet to " + name + "...");
    }
}
