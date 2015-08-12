package com.springs.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements InitializingBean, DisposableBean, BeanNameAware {
    

    public Manager(Employee employee) {

    }

    @PostConstruct
    public void init1() throws Exception {
        System.out.println("Init method called: ");
    }
     
    @PreDestroy
    public void destroy1() throws Exception {
        System.out.println("Destroy method called: ");
    }
    
    public void addManager(){
        System.out.println("addManager() is running ");
    }
    
    public void abc() throws Exception {
        System.out.println("abc method called: ");
    }
    
    public void def() throws Exception {
        System.out.println("def method called: ");
    }

    public Manager() {
        System.out.println("Manager created.");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet...");
    }

    public void destroy() throws Exception {
        System.out.println("destroy...");
    }

    public void setBeanName(String arg0) {
        System.out.println("Bean Name set");
    }

}
