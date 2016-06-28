package com.winchampion.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by super on 2016/6/15.
 */
public class MyCglibProxy implements MethodInterceptor{
//    private Logger logger = LoggerFactory.getLogger(MyCglibProxy.class);
    public Enhancer enhancer = new Enhancer();
    private String name;

    public MyCglibProxy(String name){
        this.name = name;
    }

    public Object getDaoBean(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        logger.info("调用的方法是：" + method.getName());
        System.err.println("调用的方法是: "+method.getName());
        //用户进行判断
        if(!"胡浩杰".equals(name)){
            System.out.println("你没有权限");
            return null;
        }
        Object result = methodProxy.invokeSuper(o,objects);
        return result;
    }
}
