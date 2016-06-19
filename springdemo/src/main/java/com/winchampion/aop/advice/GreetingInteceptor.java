package com.winchampion.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class GreetingInteceptor implements MethodInterceptor {
    /**
     * Spring直接使用Aop联盟定义的MethodInteceptor作为环绕增强的接口，该接口
     * 拥有唯一的接口方法invoke，不但封装了目标方法及其入参数组，还封装了目标方法所在的实例对象
     * 通过MethodInvocation的getArguments方法可以获取目标方法的入参数组，通过proceed反射调用
     * 目标实例的相应的方法。
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();//目标方法入参
        String clientName = (String) args[0];
        System.out.println("How are you! Mr." + clientName + ".");

        Object obj = invocation.proceed();

        System.out.println("Please enjoy yourself!");
        return obj;
    }
}
