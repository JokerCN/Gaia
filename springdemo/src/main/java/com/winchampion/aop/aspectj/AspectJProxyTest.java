package com.winchampion.aop.aspectj;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Created by super on 2016/6/28.
 */
public class AspectJProxyTest {
    Waiter target = new NaiveWaiter();
    AspectJProxyFactory factory = new AspectJProxyFactory();

    {
        //设置目标对象
        factory.setTarget(target);

        //添加（@Aspect修饰的）切面类
        factory.addAspect(PreGreetingAspect.class);

        //生成织入切面的代理对象
        Waiter proxy = factory.getProxy();

        proxy.greetTo("John");
        proxy.serveTo("John");
    }

    public static void main(String[] args) {
        new AspectJProxyTest();
    }

}
