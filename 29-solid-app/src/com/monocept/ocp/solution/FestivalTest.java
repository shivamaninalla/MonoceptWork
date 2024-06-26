package com.monocept.ocp.solution;

public class FestivalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDepositSolution fixedDepositSolution=new FixedDepositSolution(1, "Shivamani", 1000, 1);
		
		SimpleInterest simpleInterest=new SimpleInterest(new Diwali(),fixedDepositSolution);
		
		System.out.println(simpleInterest.simpleInterestCal());
		
		System.out.println(fixedDepositSolution);
		
		
	    
		

	}

}
