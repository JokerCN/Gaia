package com.winchampion.event;

import org.springframework.context.ApplicationListener;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class MailSendListener implements ApplicationListener<MailSendEvent> {
    @Override
    public void onApplicationEvent(MailSendEvent event) {
        System.out.println("MailSendListener:向"+event.getTo()+"发送一封邮件");
    }
}
