package com.monocept.model;

public class ThreadWithThreadClass extends Thread{
	
	private String name;

	public ThreadWithThreadClass(String name) {
		super(name);
		//this.name = name;
		start();
	}
	public void run() {
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
