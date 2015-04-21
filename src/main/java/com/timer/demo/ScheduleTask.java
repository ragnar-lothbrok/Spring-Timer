package com.timer.demo;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class ScheduleTask {

	@Scheduled(cron="${cron.expression}")
	public void exexuteScheduledTask() {

		System.out.println("Executing exexuteScheduledTask method in "
				+ ScheduleTask.class+" Current time : "+new Date().getSeconds());

	}

}
