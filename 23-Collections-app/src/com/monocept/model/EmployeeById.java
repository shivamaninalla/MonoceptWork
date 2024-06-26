package com.monocept.model;

import java.util.Comparator;

public class EmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		
//		if(employee1.getSalary()>employee2.getSalary())
//			return 1;
//		if(employee1.getSalary()==employee2.getSalary())
//			return 0;
//		return -1;
		
		return (int) (employee1.getSalary()-employee2.getSalary());
	}

}
