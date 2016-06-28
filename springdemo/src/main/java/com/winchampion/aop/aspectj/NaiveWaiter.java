package com.winchampion.aop.aspectj;

/**
 * Created by super on 2016/6/28.
 */
public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String clientName) {
        System.err.println("NaiveWaiter:greet to "+ clientName + "...");
    }

    @Override
    public void serveTo(String clientName) {
        System.err.println("NaiveWaiter:serving "+ clientName + "...");
    }
}
