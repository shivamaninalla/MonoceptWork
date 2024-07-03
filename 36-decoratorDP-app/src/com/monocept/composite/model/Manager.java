package com.monocept.composite.model;

public class Manager implements IEmployee {

	private String name;
	private String position;

	public Manager(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", position=" + position + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Manager: " + name);
		System.out.println("position: " + position);

	}

}
