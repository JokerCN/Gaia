package com.winchampion.aop;

import java.lang.reflect.Proxy;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class TestForumService {
    public static void main(String[] args) {
//        ForumService forumService = new ForumServiceImpl();
        /*forumService.removeForum(10);
        forumService.removeTopic(1012);*/

        //JDK动态代理
        /*PerformanceHandler handler = new PerformanceHandler(forumService);
        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                forumService.getClass().getClassLoader(),
                forumService.getClass().getInterfaces(),
                handler);

        proxy.removeForum(10);
        proxy.removeTopic(1012);*/

        //Cglib动态代理
        CglibProxy proxy = new CglibProxy();
        ForumService forumService = (ForumService)proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1012);
    }
}
