package com.monocept.composite.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee {

	private List<IEmployee> employees;

	public EmployeeDirectory(List<IEmployee> employees) {
		super();
		this.employees = employees;
	}

	public EmployeeDirectory() {
		super();
		this.employees = new ArrayList<>();
	}

	@Override
	public void showEmployeeDetails() {

		System.out.println(employees);

	}

	@Override
	public String toString() {
		return "EmployeeDirectory [employees=" + employees + "]";
	}

	public void addEmployee(IEmployee employee) {
		employees.add(employee);
	}

	public void removeEmployee(IEmployee employee) {
		employees.remove(employee);
	}

}
