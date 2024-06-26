package com.monocept.test;

import com.monocept.model.ThreadWithThreadClass;

public class ThreadWithThreadClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(1);
		
		ThreadWithThreadClass thread1=new ThreadWithThreadClass("MyThread1");
		ThreadWithThreadClass thread2=new ThreadWithThreadClass("MyThread2");
		ThreadWithThreadClass thread3=new ThreadWithThreadClass("MyThread3");
		
		
		
		thread1.setPriority(10);
		thread2.setPriority(1);
		thread3.setPriority(5);
		
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
