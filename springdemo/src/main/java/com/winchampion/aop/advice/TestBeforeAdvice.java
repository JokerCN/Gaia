package com.winchampion.aop.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class TestBeforeAdvice {
    public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        //Spring提供的代理工厂
        ProxyFactory pf = new ProxyFactory();
        /*pf.setInterfaces(target.getClass().getInterfaces());*///指定对接口进行代理，使用jdk动态代理
        /*pf.setOptimize(true);*///启用优化，使用cglib

        //设置代理目标
        pf.setTarget(target);

        //为代理目标添加增强
        pf.addAdvice(advice);

        //生成代理实例
        Waiter proxy = (Waiter)pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
