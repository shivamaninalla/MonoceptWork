package com.monocept.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.monocept.model.Employee;

public class EmployeeListTest {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number of employees: ");
		int size=scanner.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter employee ID: ");
			int id=scanner.nextInt();
			System.out.println("Enter employee name: ");
			String name=scanner.next();
			System.out.println("Enter employee salary: ");
			double salary=scanner.nextDouble();
			
			employees.add(new Employee(id,name,salary));
		}
		
	//	System.out.println(employees);
		
		
//		Employee employee=employees.get(1);
//		System.out.println(employee);
		
//		for(Employee employee:employees) {
//			System.out.println(employee);
//		}
		
//		Iterator employeeIterator=employees.iterator();
//		while(employeeIterator.hasNext()){
//			System.out.println(employeeIterator.next());
//	}
		
	ListIterator employeeIterator1=employees.listIterator();
//		while(employeeIterator1.hasNext()) {
//			System.out.println(employeeIterator1.next());
//		}
//		while(employeeIterator1.hasPrevious()) {
//			System.out.println(employeeIterator1.previous());
//		}
		
//		for(int i=0;i<employees.size();i++) {
//			System.out.println(employees.get(i));
//		}
		
//		while(employeeIterator1 == null) {
//			System.out.println(employeeIterator1);
//		}
}

	

}
