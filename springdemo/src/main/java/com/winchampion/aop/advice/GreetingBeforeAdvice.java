package com.winchampion.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    //在目标类方法调用前执行
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String clientName = (String)args[0];
        System.out.println("How are you! Mr." + clientName + ".");
    }
}
