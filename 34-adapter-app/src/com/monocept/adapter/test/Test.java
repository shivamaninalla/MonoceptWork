package com.monocept.adapter.test;

import com.monocept.adapter.model.Biscuit;
import com.monocept.adapter.model.Choclate;
import com.monocept.adapter.model.ShoppingCart;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart shoppingCart=new ShoppingCart();
		shoppingCart.addItemToCart(new Biscuit("Marigold",10));
		
		shoppingCart.addItemToCart(new Choclate("5star",5));
		shoppingCart.displayCart();
		System.out.println(shoppingCart.getCartPrice());

	}

}
