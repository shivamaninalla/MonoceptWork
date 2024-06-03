package com.monocept.model;

public class Box {
	
	private int Height;
	private int Width;
	private int Length;
	
	public Box(int i) {
		System.out.println(i);
		System.out.println("In super class");
	}
	
	public Box(int height, int width, int length) {
		
		Height = height;
		Width = width;
		Length = length;
	}

	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	
	
	
	
	
	
	

}
