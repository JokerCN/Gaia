package com.winchampion.cglib;

/**
 * Created by super on 2016/6/15.
 */
public class Client {
    public static void main(String[] args) {
//        BookServiceBean service = BookServiceFactory.getInstance();
//        doMethod(service);
        BookServiceBean service2 = BookServiceFactory.getProxyInstance(new MyCglibProxy("boss"));
        doMethod(service2);

    }

    public static void doMethod(BookServiceBean service){
        service.create();
        service.query();
        service.update();
        service.delete();
    }
}
