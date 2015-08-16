package com.springs.test;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

public class CustomListener implements ApplicationListener<ApplicationContextEvent> {

    public void onApplicationEvent(ApplicationContextEvent event) {
        if (event.toString().indexOf("ContextClosedEvent") != -1) {
            System.out.println("***************Event ContextClosedEvent");
        } else if (event.toString().indexOf("ContextRefreshedEvent") != -1) {
            System.out.println("***************Event ContextRefreshedEvent");
        } else if (event.toString().indexOf("ContextStartedEvent") != -1) {
            System.out.println("***************Event ContextStartedEvent");
        } else if (event.toString().indexOf("ContextStoppedEvent") != -1) {
            System.out.println("***************Event ContextStoppedEvent");
        }
    }
}
