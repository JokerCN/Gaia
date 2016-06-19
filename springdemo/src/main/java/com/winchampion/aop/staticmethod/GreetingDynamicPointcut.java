package com.winchampion.aop.staticmethod;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClientList = new ArrayList<String>();
    static{
        specialClientList.add("John");
        specialClientList.add("Tom");
    }

    public ClassFilter getClassFilter(){
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                System.out.println("调用getClassFilter()对" + clazz.getName() + "做静态检查");
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    @Override
    public boolean matches(Method method,Class clazz){
        System.out.println("调用matches(method,clazz)"+ clazz.getName() + "." + method.getName() + "做静态检查");
        return "greetTo".equals(method.getName());
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        System.out.println("调用matches(method,clazz)" + targetClass.getName() + "." +method.getName() + "做动态检查");
        String clientName = (String) args[0];
        return specialClientList.contains(clientName);
    }
}
