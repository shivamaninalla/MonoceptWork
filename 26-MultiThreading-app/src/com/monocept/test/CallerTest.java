package com.monocept.test;

import com.monocept.model.CallMe;
import com.monocept.model.Caller;

public class CallerTest {
	public static void main(String args[] ) throws InterruptedException{
		
		CallMe target=new CallMe();
		
		Caller caller1=new Caller("Hello",target);
		Caller caller2=new Caller("Monocept",target);
		Caller caller3=new Caller("pvt ltd",target);
		
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread Interrupted");
		}
	}

}
