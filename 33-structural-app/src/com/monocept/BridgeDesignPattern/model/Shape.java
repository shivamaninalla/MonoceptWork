package com.monocept.BridgeDesignPattern.model;

public abstract class Shape {
	
	protected IColour color;

    public Shape(IColour color) {
        this.color = color;
    }

    public abstract void draw();

}
