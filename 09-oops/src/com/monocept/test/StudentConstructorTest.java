package com.monocept.test;

import com.monocept.model.StudentConstructor;

public class StudentConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentConstructor studentconstructor=new StudentConstructor();
		
		
		
		System.out.println("Roll Number: "+studentconstructor.getRollNumber());
		System.out.println("Name: "+studentconstructor.getName());
		System.out.println("Age: "+studentconstructor.getAge());
		
		studentconstructor.setAge(22);
		studentconstructor.setName("Shivamani");
		studentconstructor.setRollNumber(220);
		
		System.out.println("Roll Number: "+studentconstructor.getRollNumber());
		System.out.println("Name: "+studentconstructor.getName());
		System.out.println("Age: "+studentconstructor.getAge());
		
		StudentConstructor studentconstructor2=new StudentConstructor(20,"mani",21);
		System.out.println("Roll Number: "+studentconstructor2.getRollNumber());
		System.out.println("Name: "+studentconstructor2.getName());
		System.out.println("Age: "+studentconstructor2.getAge());
		
		StudentConstructor studentconstructor3=new StudentConstructor(studentconstructor);
		System.out.println("Roll Number: "+studentconstructor3.getRollNumber());
		System.out.println("Name: "+studentconstructor3.getName());
		System.out.println("Age: "+studentconstructor3.getAge());
		
		studentconstructor.setAge(34);
		studentconstructor.setName("Shiva");
		studentconstructor.setRollNumber(90);
		
		System.out.println("Roll Number: "+studentconstructor.getRollNumber());
		System.out.println("Name: "+studentconstructor.getName());
		System.out.println("Age: "+studentconstructor.getAge());
		
		
		System.out.println("Roll Number: "+studentconstructor3.getRollNumber());
		System.out.println("Name: "+studentconstructor3.getName());
		System.out.println("Age: "+studentconstructor3.getAge());

	}

}
