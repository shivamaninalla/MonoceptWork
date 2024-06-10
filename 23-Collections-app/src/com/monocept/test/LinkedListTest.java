package com.monocept.test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.monocept.model.Employee;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter number of employees: ");
//		int size=scanner.nextInt();
//		
//		for(int i=0;i<size;i++) {
//			System.out.println("Enter employee ID: ");
//			int id=scanner.nextInt();
//			System.out.println("Enter employee name: ");
//			String name=scanner.next();
//			System.out.println("Enter employee salary: ");
//			double salary=scanner.nextDouble();
//			
//			employees.add(new Employee(id,name,salary));
//		}
//		ListIterator employeeIterator1=employees.listIterator();
//		while(employeeIterator1.hasNext()) {
//		System.out.println(employeeIterator1.next());
//	}
//	while(employeeIterator1.hasPrevious()) {
//		System.out.println(employeeIterator1.previous());
//	}
//	
//	for(int i=0;i<employees.size();i++) {
//		System.out.println(employees.get(i));
//	}
//		
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.addFirst("Start");
		list.addLast("Last");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		
		System.out.println(list.contains("star"));
		
		System.out.println(list.descendingIterator());
		
//		Iterator descendingIterator1=(Iterator) list.descendingIterator();
//		while(descendingIterator1.isValid()) {
//			System.out.println(descendingIterator1);
//		}
		list.offer("j");
		System.out.println(list);
		
		
		

	}

}
