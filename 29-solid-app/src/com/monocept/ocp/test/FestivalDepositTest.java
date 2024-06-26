package com.monocept.ocp.test;

import com.monocept.ocp.model.FestivalType;
import com.monocept.ocp.model.FixedDeposit;

public class FestivalDepositTest {
	
	public static void main(String args[] ) {
		
		FixedDeposit fixedDeposit=new FixedDeposit(123,"Shivamani",100,2,FestivalType.OTHERS);
		
		System.out.println("Percentage of simple interest: "+fixedDeposit.interestRate());
		
		System.out.println("Simple Interest: "+fixedDeposit.calculateSimpleInterest());
		
		

	}

}
