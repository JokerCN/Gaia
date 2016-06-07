package com.winchampion.foo.aop;


import org.aspectj.lang.annotation.*;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/4.
 */
@Aspect
public class Logging {
    /**
     * Following is the definition for a pointcut to select
     * all the methods available. So advice will be called
     * for all the methods.
     */
    @Pointcut("execution(* com.winchampion.foo.annotation.*.* (..))")
    private void selectAll(){}

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }

    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }

    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(pointcut = "selectAll()",returning ="retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString());
    }

    @AfterThrowing(pointcut = "selectAll()",throwing ="ex")
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: "+ex.toString());
    }
}
