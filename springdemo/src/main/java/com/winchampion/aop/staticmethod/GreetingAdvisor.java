package com.winchampion.aop.staticmethod;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.err.println("proxy test match method: "+method.getName());
        return "greetTo".equals(method.getName());
    }

    public ClassFilter getClassFilter(){
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                System.err.println("class match name: " + clazz.getName());
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }
}
