package com.winchampion.aop.staticmethod;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class WaiterDelegate {
    private Waiter waiter;
    public void service(String clientName){
        waiter.greetTo(clientName);
        waiter.serveTo(clientName);
    }
    public void setWaiter(Waiter waiter){
        this.waiter = waiter;
    }
}
