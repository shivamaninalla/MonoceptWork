package com.monocept.dip.solution;

import com.monocept.dip.violation.DBLogger;
import com.monocept.dip.violation.TaxCalculator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculatorSolution t1=new TaxCalculatorSolution(new DBLoggerSolution());
		t1.calculateTax(100, 10);
		
		TaxCalculatorSolution t2=new TaxCalculatorSolution(new FileLogger());
		t2.calculateTax(2000, 0);

	}

}
