package com.timer.demo;

import java.util.Date;

public class CustomTask {
	
	public void executeThis(){
		System.out.println("Executing CustomTask's method executeThis : "+new Date().getSeconds());
	}
	
}
