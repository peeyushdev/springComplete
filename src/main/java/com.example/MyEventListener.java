package com.example;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(applicationEvent.toString());
    }
}
