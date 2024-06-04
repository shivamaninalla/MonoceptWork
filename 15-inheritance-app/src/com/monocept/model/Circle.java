package com.monocept.model;

public class Circle extends Shape{
	
	private int radius;

	public Circle(int radius) {
		
		this.radius = radius;
	}
	

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle: "+3.14*radius*radius);
	}

}
