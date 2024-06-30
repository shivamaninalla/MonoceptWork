package com.monocept.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	List<Product> product=new ArrayList<Product>();
	List<Supplier> supplier=new ArrayList<Supplier>();
	List<Transaction> transaction=new ArrayList<Transaction>();
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public List<Supplier> getSupplier() {
		return supplier;
	}
	public void setSupplier(List<Supplier> supplier) {
		this.supplier = supplier;
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	
	
	public void LoadFiles() throws IOException, ClassNotFoundException  {
		FileInputStream fileInput=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\InventoryManagementSystem\\src\\com\\monocept\\model\\ProductsFile.txt");
		ObjectInputStream in =new ObjectInputStream(fileInput);
		
		
		
		while(true) {
			try {
			Product products=(Product) in.readObject();
			product.add(products);
			System.out.println(products);
			}
			catch(EOFException e) {
				break;
			}
		}
		
		FileInputStream fileInput1=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\InventoryManagementSystem\\src\\com\\monocept\\model\\SuppliersFile.txt");
		ObjectInputStream in1 =new ObjectInputStream(fileInput1);
		while(true) {
			try {
				Supplier suppliers=(Supplier) in1.readObject();
				supplier.add(suppliers);
				System.out.println(suppliers);
				}
				catch(EOFException e) {
					break;
				}
		}
		
		FileInputStream fileInput2=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\InventoryManagementSystem\\src\\com\\monocept\\model\\TransactionFile.txt");
		ObjectInputStream in2 =new ObjectInputStream(fileInput2);
		while(true) {
			try {
				Transaction transactions=(Transaction) in2.readObject();
				transaction.add(transactions);
				System.out.println(transactions);
				}
				catch(EOFException e) {
					break;
				}
		}
			
			
			
		}
		
		
		
	
	
	public void SaveFiles() throws IOException  {
		try {
			FileOutputStream fileOut=new FileOutputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\InventoryManagementSystem\\src\\com\\monocept\\model\\ProductsFile.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			for(Product l:product) {
				System.out.println(l);
				out.writeObject(l);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileOutputStream fileOut1=new FileOutputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\InventoryManagementSystem\\src\\com\\monocept\\model\\SuppliersFile.txt");
			ObjectOutputStream out1=new ObjectOutputStream(fileOut1);
			for(Supplier k:supplier) {
				System.out.println(k);
				out1.writeObject(k);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fileOut2=new FileOutputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\InventoryManagementSystem\\src\\com\\monocept\\model\\TransactionFile.txt");
			ObjectOutputStream out2=new ObjectOutputStream(fileOut2);
			for(Transaction t:transaction) {
				System.out.println(t);
				out2.writeObject(t);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	
	public void generateReport() {
		int count=0;
		int value=0;
		for(Product l:product) {
			value+=l.getPrice();
			count++;
		}
		System.out.println("Total Count of Products: "+count);
		System.out.println("Value of Total Products: "+value);
	}
	
	

}
