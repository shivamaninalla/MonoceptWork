package com.monocept.srp.solution;

public class TaxCalculator {
	
	private InvoiceSolution invoice;
	
	
	
	public TaxCalculator(InvoiceSolution invoice) {
		super();
		this.invoice = invoice;
	}



	public void calculateTax() {
		System.out.println("Tax: "+ (invoice.getAmount()*invoice.getTax())/100);
	}

}
