package com.monocept.srp.solution;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			InvoiceSolution invoice=new InvoiceSolution(1,"Maggi",10000,10);
			
			InvoicePrinter invoicePrinter=new InvoicePrinter(invoice);
			invoicePrinter.printInvoice();
			
			TaxCalculator taxCalculator=new TaxCalculator(invoice);
			taxCalculator.calculateTax();
			
			
		
		

	}

}
