package com.victor.springscheduler.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tasks {
	
	private static final Logger LOG = LoggerFactory.getLogger(Tasks.class);
	
	//Run the LOG every 5 seconds
	@Scheduled(fixedRate = 5000)
	public void logCurrentDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		LOG.info("La hora actual es {}", dateFormat.format(new Date()));
	}
	

}
