package com.monocept.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//import com.monocept.model.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer=(a)->{ 
		int prod=1;
		while(a!=0) {
			prod=prod*a;
			a--;
		}
			System.out.println(prod);
		};
		
		BiConsumer<Integer, Integer> biConsumer=(number1,number2)->{
				//System.out.println("Addition is: "+(number1+number2));
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("Numbers after swapping are:\nNumber1: "+number1+"\nNumber2: "+number2);

		};
				
		
		
		consumer.accept(5);
		biConsumer.accept(2, 3);
	}

}
