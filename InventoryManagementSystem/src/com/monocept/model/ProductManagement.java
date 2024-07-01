package com.monocept.model;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.monocept.exceptions.DuplicateProduct;
import com.monocept.exceptions.InvalidProduct;

public class ProductManagement {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	private Inventory inventory;

	public ProductManagement(Inventory inventory) {
		super();
		this.inventory = inventory;
	}

	public ProductManagement() {
		// TODO Auto-generated constructor stub
	}

	public void addNewProduct() {
		System.out.println("Enter product Details");
		// Product product=new Product();
		int id = random.nextInt(10);
		String id1 = String.format("%s%d", "prod", id);
		// product.setProductID(id1);
		System.out.println("Enter product name: ");
		String name = scanner.next();
		// product.setName(name);
		System.out.println("Enter Description: ");
		String description = scanner.next();
		// product.setDescription(description);
		System.out.println("Enter quantity: ");
		int quantity = scanner.nextInt();
		// product.setQuantity(quantity);
		System.out.println("Enter price: ");
		double price = scanner.nextDouble();
		// product.setPrice(price);

		Product product = new Product(id1, name, description, quantity, price);
		for (Product l : inventory.getProduct()) {
			if (l.getProductID().equals(id1))
				throw new DuplicateProduct();
		}
		inventory.getProduct().add(product);
		// list.add(product);

		System.out.println("Product is added");

	}

	public void updateProductDetails() {
		boolean x = true;
		Product c = checkProductId();
		if (c != null) {
			while (x) {

				System.out.println("You can update the following things");
				System.out.println("1.Update name\n2.Update description\n3.Update price\n4.Exit");
				System.out.println("Enter your choice: ");
				int n = scanner.nextInt();
				switch (n) {
				case 1:
					// updateName(list);
					System.out.println("Enter new name: ");
					String m = scanner.next();
					c.setName(m);
					break;
				case 2:
					// updateDescritption(list);
					System.out.println("Enter new Description: ");
					String k = scanner.next();
					c.setDescription(k);
					break;
				case 3:
					// updatePrice(list);
					System.out.println("Enter new price: ");
					double p = scanner.nextInt();
					c.setPrice(p);
					break;
				case 4:
					System.out.println("You got exit from Update product");
					x = false;
				}
			}

		}
	}

	private Product checkProductId() {
		System.out.println("Enter product ID to update the things");
		String id = scanner.next();

		for (Product l : inventory.getProduct()) {
			if (l.getProductID().equals(id))
				return l;
		}
		throw new InvalidProduct();
		// return null;

	}

//	private boolean updatePrice(List<Product> list) {
//		System.out.println("Enter the product id to change price: ");
//		String n=scanner.next();
//		for(Product l:list) {
//			if(l.getProductID().equals(n)) {
//				System.out.println("Enter new price: ");
//				double p=scanner.nextInt();
//				l.setPrice(p);
//				return true;
//			}
//				
//		}
//		System.out.println("You entered the wrong productID");
//		return false;
//		
//	}
//
//
//	private boolean updateDescritption(List<Product> list) {
//		System.out.println("Enter the product id to change description: ");
//		String n=scanner.next();
//		for(Product l:list) {
//			if(l.getProductID().equals(n)) {
//				System.out.println("Enter new Description: ");
//				String m=scanner.next();
//				l.setDescription(m);
//				return true;
//			}
//				
//		}
//		System.out.println("You entered the wrong productID");
//		return false;
//		
//	}
//
//
//	private boolean updateName(List<Product> list) {
//		
//		System.out.println("Enter the product id to change the product name: ");
//		String n=scanner.next();
//		for(Product l:list) {
//			if(l.getProductID().equals(n)) {
//				System.out.println("Enter new name: ");
//				String m=scanner.next();
//				l.setName(m);
//				return true;
//			}
//				
//		}
//		System.out.println("You entered the wrong productID");
//		return false;
//		
//	}

	public boolean deleteProduct() {
		System.out.println("Enter product id to delete the product: ");
		String id = scanner.next();
		for (int i = 0; i < inventory.getProduct().size(); i++) {
			if (id.equals(inventory.getProduct().get(i).getProductID())) {
				inventory.getProduct().remove(i);
				System.out.println("Product got removed");
				return true;
			}
		}
		throw new InvalidProduct();

	}

	public boolean productDetails() {
		System.out.println("Enter the product Id for getting details");
		String id = scanner.next();
		for (Product l : inventory.getProduct()) {
			if (l.getProductID().equals(id)) {
				System.out.println("Product id: " + l.getProductID());
				System.out.println("Product name: " + l.getName());
				System.out.println("Product description: " + l.getDescription());
				System.out.println("Product Quantity: " + l.getQuantity());
				System.out.println("Product Price: " + l.getPrice());
				return true;
			}

		}
		throw new InvalidProduct();

	}

	public void viewAllProducts() {
//		for(Product l:list) {
//			System.out.println(l);
//		}
		System.out.println(inventory.getProduct());
	}

}
