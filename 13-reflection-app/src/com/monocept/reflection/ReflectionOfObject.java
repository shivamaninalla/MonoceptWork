package com.monocept.reflection;

public class ReflectionOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class objectClass=Class.forName("java.lang.Object");
			
			System.out.println(objectClass.getName());
			System.out.println(objectClass.getModifiers());
			System.out.println(objectClass.getSimpleName());
			System.out.println(objectClass.isMemberClass());
			System.out.println(objectClass.toString());
			System.out.println(objectClass.getAnnotatedSuperclass());
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
