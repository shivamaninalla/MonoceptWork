package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.StudentObjects;

public class StudenObjectsTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number of Students: ");
		int n=scanner.nextInt();
		
		StudentObjects records[]=new StudentObjects[n];
		
		for(int i=0;i<n;i++) {
			records[i]=new StudentObjects();
			System.out.println("Enter Roll Number: ");
			records[i].setRollNumber(scanner.nextInt());
			System.out.println("Enter name: ");
			records[i].setName(scanner.next());
			System.out.println("Enter emailId: ");
			records[i].setEmailId(scanner.next());
			System.out.println("Enter Age: ");
			records[i].setAge(scanner.nextInt());
		}
		for(StudentObjects i:records ) {
			System.out.println(i);
			System.out.println(" ");
		}

	}
	

}
