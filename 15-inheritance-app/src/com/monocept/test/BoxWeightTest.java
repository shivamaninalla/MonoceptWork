package com.monocept.test;

import com.monocept.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		BoxWeight boxWeight=new BoxWeight();
		
		BoxWeight boxWeight1=new BoxWeight(40,30,20,10);
		
		

		
		
		System.out.println("Height: "+boxWeight.getHeight());
		System.out.println("Weight: "+boxWeight.getWeight());
		System.out.println("Length: "+boxWeight.getLength());
		System.out.println("Width: "+boxWeight.getWidth());
	}

}
