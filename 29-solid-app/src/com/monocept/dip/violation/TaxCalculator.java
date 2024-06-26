package com.monocept.dip.violation;

public class TaxCalculator {
	
	private DBLogger dbLogger;

	public TaxCalculator(DBLogger dbLogger) {
		super();
		this.dbLogger = dbLogger;
	}
	public void calculateTax(int amount,int rate) {
		int tax=0;
		try{
		tax=amount/rate;
		System.out.println(tax);
		}
		catch(Exception e){
			new DBLogger().log("Divide by zero");
		}
		
	}

}
