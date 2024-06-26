package com.monocept.test;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<LocalDate> supplier=()->{
//			Random random=new Random();
//			return random.nextInt();
			return LocalDate.now();
			
			
			
		};
		
	//	System.out.println("Random Number generated is: "+supplier.get());
		System.out.println("Today's Date: "+supplier.get());

	}

}
