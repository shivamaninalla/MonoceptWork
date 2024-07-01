package com.monocept.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.monocept.exceptions.InsufficientStockException;
import com.monocept.exceptions.InvalidProduct;

public class TransactionManagement {
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	private Inventory inventory;
	private Transaction transaction;

	public TransactionManagement(Inventory inventory) {
		super();
		this.inventory = inventory;
	}
	

	public TransactionManagement(Transaction transaction) {
		super();
		this.transaction = transaction;
	}


	public synchronized void  addStock() {
		System.out.println("You coosed to add stock for a product");
		System.out.println("Enter productID: ");
		String n=scanner.next();
		
		for(Product l:inventory.getProduct()) {
			if(l.getProductID().equals(n)) {
				System.out.println("Enter the stock to be added");
				int k=scanner.nextInt();
				int newStock=l.getQuantity()+k;
				l.setQuantity(newStock);
				int j=random.nextInt(100)+1;
				String r=String.format("%s%d", "transaction",j);
				inventory.getTransaction().add(new Transaction(r,l.getProductID(),"ADD",k,LocalDate.now()));
				
				
			}
		}
	}
	
	public synchronized void removeStock() {
		
		System.out.println("You choosed to remove stock for a product");
		System.out.println("Enter productID: ");
		String n=scanner.next();
		for(Product l:inventory.getProduct()) {
			if(!l.getProductID().equals(n)) {
				throw new InvalidProduct();
			}
		}
	//	System.out.println("Stock present for that product: "+l.getQuantity());
		System.out.println("Enter the stock to be removed");
		int p=scanner.nextInt();
		for(Product l:inventory.getProduct()) {
			if(l.getProductID().equals(n)) {
				int c=checkQuantity(l,p);
				l.setQuantity(c);
				System.out.println("Stock present after removing: "+l.getQuantity());
				int k=random.nextInt(100)+1;
				String r=String.format("%s%d", "transaction",k);
				inventory.getTransaction().add(new Transaction(r,l.getProductID(),"REMOVE",p,LocalDate.now()));
				
				
			}
		}
		
	}
	
	private int checkQuantity(Product l,int n) {
		
		
		
		if(l.getQuantity()>n) {
		int newStock=l.getQuantity()-(n);
		
		return newStock;
		}
		throw new InsufficientStockException();
	}

	public synchronized void transactionHistory( ) {
		
		for(Transaction l:inventory.getTransaction()) {
			System.out.println(l);
		}
		
		
	}

}
