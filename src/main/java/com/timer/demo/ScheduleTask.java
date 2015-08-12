package com.timer.demo;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleTask {

	@Scheduled(cron="${cron.expression}")
	/*@Scheduled(fixedRate = 18)*/
	public void exexuteScheduledTask() {

//		System.out.println("Executing exexuteScheduledTask method in "
//				+ ScheduleTask.class+" Current time : "+new Date().getSeconds());

	}

}
