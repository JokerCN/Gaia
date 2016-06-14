package com.winchampion.foo.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/3.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish(){
        CustomEvent e = new CustomEvent(this);
        applicationEventPublisher.publishEvent(e);
    }
}
