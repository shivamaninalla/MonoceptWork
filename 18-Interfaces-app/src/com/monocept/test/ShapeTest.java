package com.monocept.test;

import com.monocept.model.Circle;
import com.monocept.model.Rectangle;
import com.monocept.model.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle circle=new Circle(10);
//		circle.area();
//		circle.perimeter();
//		
//		Rectangle rectangle=new Rectangle(10,20);
//		rectangle.area();
//		rectangle.perimeter();
		
		Shape shape;
		shape=new Circle(10);
		shape.area();
		shape.perimeter();
		
		shape=new Rectangle(10,20);
		shape.area();
		shape.perimeter();
		

	}

}
