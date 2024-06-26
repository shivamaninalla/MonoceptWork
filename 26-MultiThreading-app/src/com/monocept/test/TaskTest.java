package com.monocept.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.monocept.model.Task;

public class TaskTest {

	public static void main(String[] args) {
		

		
//		int count=Runtime.getRuntime().availableProcessors();
//		System.out.println(count);
//		
//		ExecutorService service=Executors.newCachedThreadPool();
     	ScheduledExecutorService service=Executors.newScheduledThreadPool(1);
		
		//ExecutorService service=Executors.newSingleThreadExecutor();
	//	service.schedule(new Task(), 5, TimeUnit.SECONDS);
		
	//	service.scheduleAtFixedRate(new Task(), 5, 10, TimeUnit.SECONDS);
		
		service.scheduleWithFixedDelay(new Task(), 5, 5, TimeUnit.SECONDS);
		
		


		
		




	}

}
