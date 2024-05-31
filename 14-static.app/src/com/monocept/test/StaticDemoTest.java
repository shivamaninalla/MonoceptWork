package com.monocept.test;

import com.monocept.model.StaticDemo;

public class StaticDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo demo1=new StaticDemo();
		demo1.display();
		StaticDemo demo2=new StaticDemo();
		demo2.display();
		StaticDemo demo3=new StaticDemo();
		demo3.display();
		
		
		demo1.increment();
		demo1.display();
		
		demo2.increment();
		demo2.display();
		
		demo3.increment();
		demo3.display();
	}
	{
		System.out.println("Non static block test class");
	}
	static {
		System.out.println("Static block test class");
	}
	
	
	

}
