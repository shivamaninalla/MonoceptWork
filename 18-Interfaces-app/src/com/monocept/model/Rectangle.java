package com.monocept.model;

public class Rectangle implements Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle: "+length*width);
		
	}
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Rectangle: "+(2*(length+width)));
		
	}

}
