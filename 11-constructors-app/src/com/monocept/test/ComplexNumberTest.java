package com.monocept.test;

import com.monocept.model.ComplexNumber;

public class ComplexNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber complexnumber=new ComplexNumber();
		
		System.out.println(complexnumber.getReal()+"+i"+complexnumber.getImagenary());
		
		ComplexNumber complexnumber1=new ComplexNumber(20,30);
		
		ComplexNumber complexnumber2=new ComplexNumber(40,50);
		
		System.out.println(complexnumber1.Addition(complexnumber1,complexnumber2));
		
		

	}

}
