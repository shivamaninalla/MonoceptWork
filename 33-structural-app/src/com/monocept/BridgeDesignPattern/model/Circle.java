package com.monocept.BridgeDesignPattern.model;

public class Circle extends Shape {

	public Circle(IColour color) {
		super(color);

	}

	@Override
	public void draw() {
		System.out.print("Drawing Circle - ");
		color.applyColour();

	}

}
