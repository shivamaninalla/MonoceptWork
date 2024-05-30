package com.monocept.test;

import com.monocept.model.EmployeeConstructor;

public class EmployeeConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeConstructor employeeconstructor=new EmployeeConstructor();
		System.out.println("id: "+employeeconstructor.getId());
		System.out.println("name: "+employeeconstructor.getName());
		System.out.println("salary: "+employeeconstructor.getSalary());
		
		employeeconstructor.setId(220);
		employeeconstructor.setName("Shivamani");
		employeeconstructor.setSalary(350000);
		
		System.out.println("id: "+employeeconstructor.getId());
		System.out.println("name: "+employeeconstructor.getName());
		System.out.println("salary: "+employeeconstructor.getSalary());
		
		EmployeeConstructor employeeconstructor1=new EmployeeConstructor(20,"Mani",45000);
		System.out.println("id: "+employeeconstructor1.getId());
		System.out.println("name: "+employeeconstructor1.getName());
		System.out.println("salary: "+employeeconstructor1.getSalary());
		
		
		EmployeeConstructor employeeconstructor2=new EmployeeConstructor(employeeconstructor);
		System.out.println("id: "+employeeconstructor2.getId());
		System.out.println("name: "+employeeconstructor2.getName());
		System.out.println("salary: "+employeeconstructor2.getSalary());
		
		EmployeeConstructor employeeconstructor3=new EmployeeConstructor(employeeconstructor1);
		System.out.println("id: "+employeeconstructor3.getId());
		System.out.println("name: "+employeeconstructor3.getName());
		System.out.println("salary: "+employeeconstructor3.getSalary());
		
	}

}
