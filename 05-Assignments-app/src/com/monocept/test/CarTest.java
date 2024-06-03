package com.monocept.test;

import java.util.Scanner;

import com.monocept.assignments.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car car=new Car();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of cars: ");
		int n=scanner.nextInt();
		Car car[]=new Car[n];
		for(int i=0;i<n;i++) {
			car[i]=new Car();
			System.out.println("Enter name of the company");
			car[i].setCompanyName(scanner.next());
			System.out.println("Enter mileage");
			car[i].setMileage(scanner.nextDouble());
			System.out.println("Enter price of the car: ");
			car[i].setPrice(scanner.nextDouble());
		}
		
		for(int j=0;j<n;j++) {
			System.out.println(car[j]);
			System.out.println("");
		}

	}

}
