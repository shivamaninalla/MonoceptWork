package com.monocept.model;

public class ThreadWithRunnableInterface implements Runnable{
	
	public Thread thread;
	

	public ThreadWithRunnableInterface(String name) {
		//super();
		this.thread = new Thread(this,name);
		thread.start();
	}


	@Override
	public void run() {
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
