package com.model.monocept;

public class PracticeNonSubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeSuperClass psc=new PracticeSuperClass();
		psc.k=3;
		psc.display();
		psc.s=9;
	PracticeNonSubClass h=new PracticeNonSubClass();
		
		//h.display();
		

	}
	public void pub() {
		System.out.println("I am public in non sub class");
	}

}
