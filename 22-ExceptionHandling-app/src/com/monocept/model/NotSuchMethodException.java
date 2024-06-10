package com.monocept.model;

import java.lang.reflect.Method;

public class NotSuchMethodException {
	public void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NotSuchMethodException obj=new NotSuchMethodException();
//		System.out.println(obj.getClass());
//		
//		Method method;
//		try {
//			method = NotSuchMethodException.class.getMethod(display);
//		} catch (NoSuchMethodException | SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		NotSuchMethodException object=new NotSuchMethodException();
		object.display();
		//object.print();
		

	}

	

}
