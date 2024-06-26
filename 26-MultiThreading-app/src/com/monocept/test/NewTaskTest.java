package com.monocept.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.monocept.model.NewTask;

public class NewTaskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(1);
		
		List<NewTask> tasks=new ArrayList<NewTask>();
		
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		
		try {
			List<Future<Integer>> futures=service.invokeAll(tasks);			
			for(Future<Integer> future: futures) {
				try {
					System.out.println( future.get());
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Integer future1=service.invokeAny(tasks);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
