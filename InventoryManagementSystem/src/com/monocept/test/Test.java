package com.monocept.test;

import java.io.IOException;
import java.util.Scanner;

import com.monocept.model.Inventory;
import com.monocept.model.ProductManagement;
import com.monocept.model.SupplierManagement;
import com.monocept.model.TransactionManagement;

public class Test {
	private static final Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		Inventory inventory=new Inventory();
		TransactionManagement transaction=new TransactionManagement(inventory);
		ProductManagement productManagement=new ProductManagement(inventory);
		SupplierManagement supplierManagement=new SupplierManagement(inventory);
		
		boolean x=true;
		System.out.println("Hi customers this is Inventory Management System");
		while(x) {
			System.out.println("1.Product Management\n2.Supplier Management\n3.Transaction Management\n4.Load the Data from file\n5.Save the Data to file\n6.Generate Reports\n7.Exit");
			System.out.println("Enter your choice:");
			int number=scanner.nextInt();
			switch(number) {
			case 1:productManagement(productManagement);
			break;
			case 2:supplierManagement(supplierManagement);
			break;
			case 3:transactionManagement(transaction);
			break;
			case 4:load(inventory);
			break;
			case 5:save(inventory);
			break;
			case 6:generateReports(inventory);
			break;
			case 7:System.out.println("You got exit from Inventory Management");
			x=false;
			}
		}
		

		
		
		
	}

	private static void generateReports(Inventory inventory) {
		inventory.generateReport();
		
	}

	private static void save(Inventory inventory) {
		try {
			inventory.SaveFiles();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void load(Inventory inventory) {
		try {
			inventory.LoadFiles();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	private static void transactionManagement(TransactionManagement transaction) {
		System.out.println("You choosed Transaction Management");
		boolean y=true;
		while(y) {
			System.out.println("1.Add stock fora product\n2.Remove stock for a product\n3.Transaction History\n4.Exit");
			System.out.println("Enter your choice: ");
			int n=scanner.nextInt();
			switch(n) {
			case 1:transaction.addStock();
			break;
			case 2:transaction.removeStock();
			break;
			case 3:transaction.transactionHistory();
			break;
			case 4:System.out.println("You got exit from Transaction Management");
			y=false;
			}
		}
		
	}

	private static void supplierManagement(SupplierManagement supplierManagement) {
		System.out.println("You choosed Supplier Management");
		boolean y=true;
		while(y) {
			System.out.println("1.Add new Supplier\n2.Update supplier Details\n3.Delete a supplier\n4.View Particular supplier details\n5.View all supplier\n6.Exit");
			System.out.println("Enter your choice: ");
			int n=scanner.nextInt();
			switch(n) {
			case 1:supplierManagement.addNewSupplier();
			break;
			case 2:supplierManagement.updateSupplierDetails();
			break;
			case 3:supplierManagement.deleteSupplier();
			break;
			case 4:supplierManagement.supplierDetails();
			break;
			case 5:supplierManagement.viewAllSupplier();
			break;
			case 6:System.out.println("You got exit from Supplier Management");
			y=false;
			}
		}
		
	}

	private static void productManagement(ProductManagement productManagement) {
		
		System.out.println("You choosed Product Management");
		boolean y=true;
		while(y) {
		System.out.println("1.Add new Product\n2.Update product Details\n3.Delete a product\n4.View Particular Product details\n5.View all products\n6.Exit");
		int n=scanner.nextInt();
		switch(n) {
		case 1:productManagement.addNewProduct();
		break;
		case 2:productManagement.updateProductDetails();
		break;
		case 3:productManagement.deleteProduct();
		break;
		case 4:productManagement.productDetails();
		break;
		case 5:productManagement.viewAllProducts();
		break;
		case 6:System.out.println("You got exit from Product Management");
		y=false;
		}
		}
	}

}
