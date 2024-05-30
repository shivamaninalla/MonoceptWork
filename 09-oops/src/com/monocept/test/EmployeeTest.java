package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Employee employee1=new Employee();
		
		System.out.println("Enter name of employee: ");
		String name1=scanner.next();
		System.out.println("Enter id of employee: ");
		int id1=scanner.nextInt();
		System.out.println("Enter salary of employee: ");
		int salary1=scanner.nextInt();
		
		
		
		employee1.setId(id1);
		employee1.setName(name1);
		employee1.setSalary(salary1);
		
		System.out.println("Name: "+employee1.getName());
		System.out.println("Id: "+employee1.getId());
		System.out.println("Salary: "+employee1.getSalary());
		
		
		Employee employee2=new Employee();
		
		System.out.println("Enter name of employee: ");
		String name2=scanner.next();
		System.out.println("Enter id of employee: ");
		int id2=scanner.nextInt();
		System.out.println("Enter salary of employee: ");
		int salary2=scanner.nextInt();
		
		
		
		employee2.setId(id2);
		employee2.setName(name2);
		employee2.setSalary(salary2);
		
		System.out.println("Name: "+employee2.getName());
		System.out.println("Id: "+employee2.getId());
		System.out.println("Salary: "+employee2.getSalary());
		
		
		
		
		

	}

}
