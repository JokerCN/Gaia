package com.winchampion.methodreplace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by super on 2016/6/13.
 */
public class Director implements MethodReplacer{
    //用于替换他人的Bean必须实现MethodReplacer接口，Spring将利用该接口方法去替换目标Bean的方法
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        Car car = new Car();
        car.setBrand("美人豹");
        return car;
    }
}
