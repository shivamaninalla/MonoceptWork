package com.monocept.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		int a,b;
		
		Class stringClass=Class.forName("java.lang.String");
		
		System.out.println(stringClass.getName());
		System.out.println(stringClass.toString());
		System.out.println(stringClass.getConstructors());
		
		Constructor constructors[]=stringClass.getConstructors();
		
		for(Constructor constructor:constructors) {
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameterCount());
			Parameter parameters[]=constructor.getParameters();
			for(Parameter parameter: parameters) {
				System.out.println(parameter.getName()+"\t"+parameter.getParameterizedType());
			}
		}
		
		Method[] methods=stringClass.getMethods();
		for(Constructor constructor:constructors) {
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameterTypes());
			System.out.println(constructor.getClass());
		}

	}
	
	public int add (int a,int b) {
		return a+b;
	}


}


