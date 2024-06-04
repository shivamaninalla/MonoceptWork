package com.monocept.model;

public class Rectangle extends Shape{
	
	private int length;
	private int width;
	
	
	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle: "+length*width);
		
	}

}
