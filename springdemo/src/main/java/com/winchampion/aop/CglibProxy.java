package com.winchampion.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj,Method method,Object[] args, MethodProxy proxy) throws Throwable{
        PerformanceMonitor.begin(obj.getClass().getName()+"."+method.getName());
        Object result = proxy.invokeSuper(obj,args);
        PerformanceMonitor.end();
        return result;
    }
}
