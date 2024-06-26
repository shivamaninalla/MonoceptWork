package com.monocept.ocp.solution;

public class SimpleInterest {
	private InterestRate interestRate;
	private FixedDepositSolution fixedDepositSolution;
	private FestivalInterface festivalInterface;

	public SimpleInterest( FestivalInterface festivalInterface, FixedDepositSolution fixedDepositSolution2) {
		super();
		this.festivalInterface = festivalInterface;
		this.fixedDepositSolution=fixedDepositSolution2;
	}
	
	public double simpleInterestCal() {
		return fixedDepositSolution.getPrinciple()*fixedDepositSolution.getDuration()*festivalInterface.interestRate()/100;
		
	}

	

}
