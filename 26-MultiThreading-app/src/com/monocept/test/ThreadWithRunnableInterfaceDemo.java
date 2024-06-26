package com.monocept.test;

import com.monocept.model.ThreadWithRunnableInterface;

public class ThreadWithRunnableInterfaceDemo {

	public static void main(String[] args) {
		ThreadWithRunnableInterface thread1=new ThreadWithRunnableInterface("thread1");
		ThreadWithRunnableInterface thread2=new ThreadWithRunnableInterface("thread2");
		
		int a=9,b=8;
		System.out.println(a+b);
		
	}

}
