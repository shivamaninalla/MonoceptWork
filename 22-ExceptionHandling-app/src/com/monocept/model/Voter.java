package com.monocept.model;

import com.monocept.exceptions.AgeInvalidException;

public class Voter {
	
	private int age;
	private String name;
	public Voter(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public void vote() {
		if(age<18)
			throw new AgeInvalidException();
		System.out.println(name+"'s vote is casted");
	}

}
