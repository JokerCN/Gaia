package com.winchampion.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("event-beans.xml");
        MailSender ms = context.getBean("mailSender",MailSender.class);
        ms.sendMail("superyangyw@126.com");
    }
}