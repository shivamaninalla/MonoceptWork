package com.monocept.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Serializable{
	
	private String transactionID;
	private String productID;
	private String type;
	private int quantity;
	private LocalDate date;
	public Transaction(String transactionID, String productID, String type, int quantity, LocalDate date) {
		super();
		this.transactionID = transactionID;
		this.productID = productID;
		this.type = type;
		this.quantity = quantity;
		this.date = date;
	}
	public Transaction() {
		super();
	}
	public String getTransactionID() {
		return transactionID;
	}
	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", productID=" + productID + ", type=" + type
				+ ", quantity=" + quantity + ", date=" + date + "]";
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
