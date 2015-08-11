package com.springs.test;

public class ManagerI {

    public String addData() {
        System.out.println("Added.");
        // System.out.println(1/0);
        // throw new IllegalArgumentException();
        return "Added";
    }

    public void addData(String data) {
        System.out.println("Paramatrised method."+data);
    }
    
    public void addData(Integer data) {
        System.out.println("Paramatrised method."+data);
    }

}
