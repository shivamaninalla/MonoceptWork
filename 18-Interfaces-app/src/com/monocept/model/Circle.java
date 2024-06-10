package com.monocept.model;

public class Circle implements Shape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void area() {
		System.out.println("Area of circle: "+(3.14*radius*radius));
		
	}

	public void perimeter() {
		System.out.println("Circumference of circle: "+(2*3.14*radius));
		
	}
	

}
