package com.monocept.model;

public class StudentObjects {
	private int rollNumber;
	private String name;
	private int age;
	private String emailId;
	
	
	public StudentObjects() {
		super();
	}


	public StudentObjects(int rollNumber, String name, int age, String emailId) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "StudentObjects [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", emailId=" + emailId
				+ "]";
	}
	
	
	

}
