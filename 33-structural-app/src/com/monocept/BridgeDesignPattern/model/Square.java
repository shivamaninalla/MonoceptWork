package com.monocept.BridgeDesignPattern.model;

public class Square extends Shape {

	public Square(IColour color) {
		super(color);

	}

	@Override
	public void draw() {
		System.out.print("Drawing Square - ");
		color.applyColour();

	}

}
