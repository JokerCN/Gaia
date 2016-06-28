package com.winchampion.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by super on 2016/6/28.
 */
//通过@Aspect注解将PreGreetingAspect标识为一个切面
@Aspect
public class PreGreetingAspect {
    //@Before注解定义切点和增强类型
    //糅合了增强类型、目标切点表达式、增强所用的横切逻辑
    @Before("execution(* greetTo(..))")
    public void beforeGreeting(){
        System.out.println("How are you");
    }
}
