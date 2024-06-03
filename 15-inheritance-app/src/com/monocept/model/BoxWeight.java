package com.monocept.model;

public class BoxWeight extends Box{
	private int weight;
	
	

	public BoxWeight() {
		super(10);
		System.out.println("IN subclass");
	}

	
	public BoxWeight( int weight,int height, int width, int length) {
		super(height, width, length);
		this.weight = weight;
	}


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	

}
