package com.monocept.model;

public class EmployeeConstructor {
	private int id;
	private String name;
	private int salary;
	
	public EmployeeConstructor() {
		
	}
	public EmployeeConstructor(int id1, String name1, int salary1) {
		id=id1;
		name=name1;
		salary=salary1;
	}
	public EmployeeConstructor( EmployeeConstructor employeeconstructor) {
		id=employeeconstructor.getId();
		name=employeeconstructor.name;
		salary=employeeconstructor.salary;
	}
	
	
	public void setId(int id1) {
		id=id1;
	}
	public void setName(String name1) {
		name=name1;
	}
	public void setSalary(int salary1) {
		salary=salary1;
	}
	
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	
	

}
