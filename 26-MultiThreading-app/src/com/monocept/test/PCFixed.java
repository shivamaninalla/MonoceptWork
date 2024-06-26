package com.monocept.test;

import com.monocept.model.Consumer;
import com.monocept.model.Producer;
import com.monocept.model.Q;

public class PCFixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Press cntrl-c to stop.c");

	}

}
