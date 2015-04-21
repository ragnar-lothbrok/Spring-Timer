package com.timer.demo;
import java.util.Date;
import java.util.TimerTask;

public class CustomTask2 extends TimerTask{

	@Override
	public void run() {
		System.out.println("Executing CustomTask2's method run : "+new Date().getSeconds());
	}

}
