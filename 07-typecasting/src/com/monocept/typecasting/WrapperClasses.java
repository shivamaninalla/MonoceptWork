package com.monocept.typecasting;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		
		
		
		Integer numberInt=number;       //auto boxing
		
        //int n=numberInt;                 //unboxing
        
        numberInt.byteValue();
        System.out.println(numberInt.byteValue());
       
	}

}
