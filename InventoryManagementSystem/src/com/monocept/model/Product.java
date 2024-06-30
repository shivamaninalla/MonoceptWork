package com.monocept.model;

import java.io.Serializable;

public class Product implements Serializable{
	
	private String productID;
	private String name;
	private String description;
	private int quantity;
	private double price;
	public Product(String productID, String name, String description, int quantity, double price) {
		super();
		this.productID = productID;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	

}
