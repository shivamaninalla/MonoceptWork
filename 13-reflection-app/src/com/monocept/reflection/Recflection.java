package com.monocept.reflection;



public class Recflection {

	public static void main(String[] args) {
		try {
			Class c=Class.forName("com.monocept.reflection.ReflectionOfString");
			try {
				ReflectionOfString object1=(ReflectionOfString) c.newInstance();
				
				ReflectionOfString object2=(ReflectionOfString) object1;
				
				System.out.println(object1.add(36, 44));
				System.out.println(object2.add(36, 5));
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
