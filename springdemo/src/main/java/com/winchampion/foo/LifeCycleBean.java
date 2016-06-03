package com.winchampion.foo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by super on 2016/6/3.
 */
public class LifeCycleBean implements InitializingBean,DisposableBean{

    @Override
    public void afterPropertiesSet() throws Exception {
        //do some initialization method
    }

    //init-method 指定具有void返回类型且无参数的方法
    public void init(){

    }

    @Override
    public void destroy() throws Exception {
        // do some destruction method.
    }
    //建议不要使用InitializingBean或者DisposableBean中的方法原型
    //在xml中配置提供了更大的灵活性
}
