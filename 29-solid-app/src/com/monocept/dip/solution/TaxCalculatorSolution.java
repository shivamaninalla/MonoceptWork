package com.monocept.dip.solution;

import com.monocept.dip.violation.DBLogger;

public class TaxCalculatorSolution {
	
	private ILogger iLogger;

	public TaxCalculatorSolution(ILogger iLogger) {
		super();
		this.iLogger = iLogger;
	}

	public ILogger getiLogger() {
		return iLogger;
	}

	public void setiLogger(ILogger iLogger) {
		this.iLogger = iLogger;
	}
	
	public void calculateTax(int amount,int rate) {
		int tax=0;
		try{
		tax=amount/rate;
		System.out.println(tax);
		}
		catch(Exception e){
			iLogger.log(e);
			
		}
		
		
	}
}