package com.monocept.model;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task implements Runnable{
	
	//private String 



	@Override
	public void run() {
		LocalTime currentTime=LocalTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime=currentTime.format(formatter);

		System.out.println("Thread: "+Thread.currentThread().getName()+"-------Time: "+formattedTime);
		
	}

}
