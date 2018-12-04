package com.example.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPulish {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(ApplicationEvent event){
        applicationEventPublisher.publishEvent(event);
    }
}
