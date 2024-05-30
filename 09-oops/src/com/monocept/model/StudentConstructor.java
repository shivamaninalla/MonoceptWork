package com.monocept.model;

public class StudentConstructor {
	private int rollNumber;
	private String name;
	private int age;
	
	public StudentConstructor() {
		
	}
	
	public StudentConstructor(int rollNumber1, String name1, int age1) {
		rollNumber=rollNumber1;
		name=name1;
		age=age1;
	
	}
	
	public StudentConstructor(StudentConstructor studentconstructor) {
		rollNumber=studentconstructor.getRollNumber();
		name=studentconstructor.name;
		age=studentconstructor.age;
	}
	
	public void setRollNumber(int rollNumber1) {
		rollNumber=rollNumber1;
	}
	public void setName(String name1) {
		name=name1;
	}
	public void setAge(int age1) {
		age=age1;
	}
	
	public int getAge() {
		return age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getName() {
		return name;
	}


}
