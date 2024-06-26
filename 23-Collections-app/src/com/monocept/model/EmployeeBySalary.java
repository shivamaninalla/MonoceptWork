package com.monocept.model;

import java.util.Comparator;

public class EmployeeBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return (int) (employee1.getSalary()-employee2.getSalary());
	}
	

}
