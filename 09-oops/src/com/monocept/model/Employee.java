package com.monocept.model;

public class Employee {
	private int id;
	private String name;
	private int salary;
	
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
