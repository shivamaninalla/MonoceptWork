package com.monocept.model;

public class Q {
	
	int n;
	
	boolean valueSet=false;
	
	synchronized int get() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interruputed exception caught");
			}
		}
		System.out.println("Got: "+n);
		valueSet=false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interrupted exception caught");
			}
		}
		this.n=n;
		valueSet=true;
		System.out.println("Put: "+n);
		notify();
		
	}

}
