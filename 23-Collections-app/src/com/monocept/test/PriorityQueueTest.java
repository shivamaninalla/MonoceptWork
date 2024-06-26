package com.monocept.test;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.monocept.model.PriorityQueueModel;

public class PriorityQueueTest {



	public static void main(String[] args) {
		
		PriorityQueue<PriorityQueueModel> task=new PriorityQueue<>(new Comparator<PriorityQueueModel>() {

			@Override
			public int compare(PriorityQueueModel t1, PriorityQueueModel t2) {
				return Integer.compare(t1.getPriority(), t2.getPriority());
				
			}
			
	});
		
		
		task.add(new PriorityQueueModel("Lunch", 2));
		task.add(new PriorityQueueModel("BreakFast", 1));
		
		task.add(new PriorityQueueModel("Dinner", 5));
		task.add(new PriorityQueueModel("Play", 4));
		
	//	System.out.println(task.peek());

		while(!task.isEmpty()) {
			System.out.println("Order: "+task.poll());
		}
	

}
	
}
