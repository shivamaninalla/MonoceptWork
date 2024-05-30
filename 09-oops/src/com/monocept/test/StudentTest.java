package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name1=scanner.next();
		System.out.println("Enter Age:");
		int age1=scanner.nextInt();
		System.out.println("Enter RollNumber: ");
		int rollNumber1=scanner.nextInt();
		
		student1.setName(name1);
		student1.setAge(age1);
		student1.setRollNumber(rollNumber1);
		
		System.out.println("RollNumber: "+student1.getRollNumber());
		System.out.println("Age: "+student1.getAge());
		System.out.println("Name: "+student1.getName());
		
	}

}
