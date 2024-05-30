package com.monocept.test;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1=new Rectangle();
		System.out.println("("+rectangle1.getHeight()+","+rectangle1.getWidth()+")");
		
		Rectangle rectangle2=new Rectangle(10,20);
		System.out.println("("+rectangle2.getHeight()+","+rectangle2.getWidth()+")");
		
		Rectangle rectangle3=new Rectangle(10);
		
		System.out.println("(Height: "+rectangle3.getHeight()+",Width: "+rectangle3.getWidth()+")");
		
		Rectangle rectangle4=new Rectangle();
		rectangle4.setHeight(34.5);
		rectangle4.setWidth(23.4);
		
		System.out.println("("+rectangle4.getHeight()+","+rectangle4.getWidth()+")");

	}

}
