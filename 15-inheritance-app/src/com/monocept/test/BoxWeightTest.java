package com.monocept.test;

import com.monocept.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		
		BoxWeight boxWeight=new BoxWeight();
		
		boxWeight.setHeight(20);
		boxWeight.setLength(30);		
		boxWeight.setWeight(40);
		
		boxWeight.setWidth(50);

		
		
		System.out.println("Height: "+boxWeight.getHeight());
		System.out.println("Weight: "+boxWeight.getWeight());
		System.out.println("Length: "+boxWeight.getLength());
		System.out.println("Width: "+boxWeight.getWidth());
	}

}
