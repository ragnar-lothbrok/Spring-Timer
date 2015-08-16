package com.springs.test;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bike implements ApplicationContextAware,BeanFactoryAware,BeanNameAware,BeanPostProcessor{

    private String company;
    private String bikeName;
    private List<String> riderNames;
    private Calendar date;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public List<String> getRiderNames() {
        return riderNames;
    }

    public void setRiderNames(List<String> riderNames) {
        this.riderNames = riderNames;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bike [company=" + company + ", bikeName=" + bikeName + ", riderNames=" + riderNames + ", date=" + date
                + "]";
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("&&&&&&&& setApplicationContext : "+applicationContext);
    }

    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println("&&&&&&&& setBeanFactory : "+arg0);
    }

    public void setBeanName(String arg0) {
        System.out.println("------------"+this);
        System.out.println("&&&&&&&& setBeanName : "+arg0);
    }

    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
        // TODO Auto-generated method stub
        return null;
    }

    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
        // TODO Auto-generated method stub
        return null;
    }

}
