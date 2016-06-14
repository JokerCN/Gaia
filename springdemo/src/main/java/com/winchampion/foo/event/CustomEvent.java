package com.winchampion.foo.event;

import org.springframework.context.ApplicationEvent;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/3.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString(){
        return "My custom evnet.";
    }
}
