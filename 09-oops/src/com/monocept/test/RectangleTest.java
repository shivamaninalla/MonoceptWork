package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle=new Rectangle();
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter width: ");
		float width1=scanner.nextFloat();
		System.out.println("Enter height: ");
		float height1=scanner.nextFloat();
		
		rectangle.setWidth(width1);
		
		rectangle.setHeight(height1);
		
		System.out.println("Area: "+rectangle.getheight()*rectangle.getwidth());
		
		
		

	}

}
