package com.model.monocept;

public class PracticeSubClass extends PracticeSuperClass{

	public static void main(String args[]) {
		PracticeSuperClass psc=new PracticeSuperClass();
		
		psc.k=3;
		
		psc.s=8;
		
		psc.display();
		
		PracticeSubClass d=new PracticeSubClass();
		d.display();
	}

}
