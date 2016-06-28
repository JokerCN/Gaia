package com.winchampion.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by super on 2016/6/15.
 */
public class BookServiceFactory {
    private static BookServiceBean service = new BookServiceBean();
    private BookServiceFactory(){}
    public static BookServiceBean getInstance(){
        return service;
    }
    public static BookServiceBean getProxyInstance(MyCglibProxy myCglibProxy){
        Enhancer enhancer = new Enhancer();
        //进行代理
        enhancer.setSuperclass(BookServiceBean.class);
        enhancer.setCallback(myCglibProxy);
        //生成代理实例
        return (BookServiceBean)enhancer.create();
    }
}
