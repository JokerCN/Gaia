package com.winchampion.foo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/3.
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("Context Started Event received.");
    }
}
