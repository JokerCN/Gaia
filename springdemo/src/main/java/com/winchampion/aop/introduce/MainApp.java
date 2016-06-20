package com.winchampion.aop.introduce;

import com.winchampion.aop.ForumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-proxy-beans.xml");
        ForumService forumService = context.getBean("forumService",ForumService.class);
        forumService.removeForum(10);
        forumService.removeTopic(1022);

        Monitorable monitorable = (Monitorable)forumService;
        monitorable.setMonitorActive(true);

        forumService.removeForum(11);
        forumService.removeTopic(1023);
    }
}
