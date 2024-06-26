package com.monocept.model;

public class Consumer implements Runnable{
	
	Q q;

	public Consumer(Q q) {
		super();
		this.q = q;
		new Thread(this,"Consumer").start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
		}
		
	}
	

}
