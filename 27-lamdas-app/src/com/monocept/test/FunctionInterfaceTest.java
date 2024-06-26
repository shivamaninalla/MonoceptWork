package com.monocept.test;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> function=(string)->{
			return string.length();
		};
		//function.andThen(3);
		System.out.println(function.apply("Shivamani"));
		
//		BiFunction<String,String,Integer> biFunction=(string1,string2)->{
//			return (string1+string2).length();
//		};
//		
//		System.out.println(biFunction.apply("Shiva","maniii"));
		
//		UnaryOperator<String> unaryOperator=(string)->{
//			return "Shiva"+string;
//		};
//		System.out.println(unaryOperator.apply("Mani"));
		
//		BinaryOperator<String> binaryOperator=(string1,string2)->{
//			return string1+string2;
//		};
//		System.out.println(binaryOperator.apply("Nalla", " Shivamani"));
		
		
//		Function<String,Integer> function=FunctionInterfaceTest::getLength;
//		
//		int length=function.apply("Shivamani");
//		
//		System.out.println("Length of the string: "+length);
		
//		BiFunction<String,Integer,ConstructorPass> biFunction=ConstructorPass::new;
//		ConstructorPass constructorPass= biFunction.apply("Shivamani", 22);
//		
//		System.out.println("Name: "+constructorPass.getName());
//		System.out.println("Age: "+constructorPass.getAge());
		
		
		
		

	}
	
	public static Integer getLength(String str) {
		return str.length();
		
	}

}
