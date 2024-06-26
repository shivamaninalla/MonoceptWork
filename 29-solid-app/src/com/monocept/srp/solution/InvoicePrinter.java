package com.monocept.srp.solution;

public class InvoicePrinter {
	
	private InvoiceSolution invoice;
	
	
	
	public InvoicePrinter(InvoiceSolution invoice) {
		super();
		this.invoice = invoice;
	}



	public void printInvoice() {
		System.out.println("Id: "+invoice.getId()+"\nDescription: "+invoice.getDescription()+"\nAmount: "+invoice.getAmount()+"\nTax percentage: "+invoice.getTax());
	}

}
