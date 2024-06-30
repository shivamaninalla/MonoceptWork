package com.monocept.model;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.monocept.exceptions.DuplicateSupplier;
import com.monocept.exceptions.InvalidProduct;

public class SupplierManagement {
	Random random=new Random();
	Scanner scanner=new Scanner(System.in);
	
	private Inventory inventory;
	
	
	public SupplierManagement(Inventory inventory) {
		super();
		this.inventory = inventory;
	}

	public void addNewSupplier() {
		System.out.println("Enter Supplier Details");
		Supplier supplier=new Supplier();
		int id=random.nextInt(10);
		String id1=String.format("%s%d","supp",id);
		supplier.setSupplierID(id1);
		System.out.println("Enter supplier name: ");
		String name=scanner.next();
		supplier.setName(name);
		System.out.println("Enter Mobile Number: ");
		
		long mobileNumber=scanner.nextLong();
		supplier.setMobileNumber(mobileNumber);
		
		
		for(Supplier l:inventory.getSupplier()) {
 			if(l.getSupplierID().equals(id1))
	                   throw new DuplicateSupplier();
		}
		inventory.getSupplier().add(supplier);

		System.out.println("supplier is added");
	}
	
	public void updateSupplierDetails() {
		boolean x=true;
		Supplier c=checkSupplierId();
		if(c!=null) {
		while(x) {
	
		System.out.println("You can update the following things");
		System.out.println("1.Update name\n2.Update Mobile Number\n3.Exit");
		System.out.println("Enter your choice: ");
		int n=scanner.nextInt();
		switch(n) {
		case 1:
		
			System.out.println("Enter new name: ");
			String m=scanner.next();
			c.setName(m);
		break;
		case 2:
		
			System.out.println("Enter new Mobile number: ");
			long k=scanner.nextLong();
			c.setMobileNumber(k);
		break;
	
		case 3:System.out.println("You got exit from Update Supplier");
		x=false;
		}
			}
			
		}
	}
	
	private Supplier checkSupplierId() {
		System.out.println("Enter supplier ID to update the things");
		String id=scanner.next();

		for(Supplier l:inventory.getSupplier()) {
			if(l.getSupplierID().equals(id)) 
				return l;
		}
		System.out.println("Supplier ID not found");
		return null;
			
			
		}
	
	public boolean deleteSupplier() {
		System.out.println("Enter supplier id to delete the product: ");
		String id=scanner.next();
		for(int i=0;i<inventory.getSupplier().size();i++) {
			if(id.equals(inventory.getSupplier().get(i).getSupplierID())) {
				inventory.getSupplier().remove(i);
				System.out.println("Supplier got removed");
				return true;
			}
		}
		System.out.println("Supplier ID not found");
		return false;
		
		
	}
	
	public boolean supplierDetails() {
		System.out.println("Enter the supplier Id for getting details");
		String id=scanner.next();
		for(Supplier l:inventory.getSupplier()) {
			if(l.getSupplierID().equals(id)) {
				System.out.println("Supplier id: "+l.getSupplierID());
				System.out.println("Supplier name: "+l.getName());
				System.out.println("Supplier Mobile number: "+l.getMobileNumber());
				
				return true;
			}
				
		}
		System.out.println("Supplier ID not found");
		return false;
		
	}
	
	public void viewAllSupplier() {
		for(Supplier s:inventory.getSupplier()) {
			System.out.println(s);
		}
	}

}
