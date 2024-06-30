package com.monocept.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private ArrayList<IItems> list;

	public ShoppingCart(ArrayList<IItems> list) {
		super();
		this.list = list;
	}
	public ShoppingCart() {
		this.list = new ArrayList<>();
	}

	public List<IItems> getList() {
		return list;
	}

	public void setList(ArrayList<IItems> list) {
		this.list = list;
	}
	
	public void addItemToCart(IItems item) {
		list.add(item);
	}
	public List<IItems> getCartItems() {
		return list;
	}
	public int getCartPrice() {
		int price=0;
		for(IItems item:list) {
			price+=item.getItemPrice();
		}
		return price;
	
	}
	public void displayCart() {
		System.out.println("ItemName-----Price");
		for(IItems item:list) {
			System.out.println(item.getItemName()+"-----"+item.getItemPrice());
		}
		int price=getCartPrice();
		System.out.println("Total-----"+price);
	}


	
	
	

}
