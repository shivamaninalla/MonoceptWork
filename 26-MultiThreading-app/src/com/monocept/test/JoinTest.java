package com.monocept.test;

import com.monocept.model.ThreadWithRunnableInterface;

public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadWithRunnableInterface thread1=new ThreadWithRunnableInterface("T1");
		ThreadWithRunnableInterface thread2=new ThreadWithRunnableInterface("T2");
		ThreadWithRunnableInterface thread3=new ThreadWithRunnableInterface("T3");
		
		System.out.println(thread1.thread.isAlive());
		System.out.println(thread2.thread.isAlive());
		System.out.println(thread3.thread.isAlive());
		
		for(int i=3;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		thread1.thread.join();
		thread2.thread.join();
		thread3.thread.join();
		
		System.out.println(thread1.thread.isAlive());
		System.out.println(thread2.thread.isAlive());
		System.out.println(thread3.thread.isAlive());
		
        System.out.println("Exiting main");
	}

}
