package com.monocept.model;

public class CallMe {
	 void call(String message) {
		System.out.print("["+message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
