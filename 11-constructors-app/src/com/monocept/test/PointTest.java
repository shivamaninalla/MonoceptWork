package com.monocept.test;

import com.monocept.model.Point;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1=new Point();
		System.out.println("Point1: ");
		System.out.println("( "+point1.getX()+","+point1.getY()+")");
		point1.setX(10);
		point1.setY(20);
		System.out.println("( "+point1.getX()+","+point1.getY()+")");
		
		Point point2=new Point(point1);
		System.out.println("Point2: ");
		System.out.println("( "+point2.getX()+","+point2.getY()+")");
		
		Point point3=new Point(44,54);
		System.out.println("Point3:");
		System.out.println("("+point3.getX()+","+point3.getY()+")");
		
		Point point4=new Point(point3);
		System.out.println("Point4:");
		System.out.println("("+point4.getX()+","+point4.getY()+")");
		
		System.out.println(point1);
		
		Point point5=new Point();
		point5=point4;
		System.out.println("("+point5.getX()+","+point5.getY()+")");
		
		System.out.println(point4.hashCode());
		System.out.println(point5.hashCode());
		
		System.out.println(point1.hashCode());
		System.out.println(point2.hashCode());
        

	}

}
