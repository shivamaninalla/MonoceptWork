package com.monocept.reflection;

public class CreateObjectsWithoutNew {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		try {
			Class c= Class.forName("com.monocept.reflection.WithoutNewTestClass");
			
			WithoutNewTestClass object1=(WithoutNewTestClass) c.newInstance();
			
			WithoutNewTestClass object2=(WithoutNewTestClass) object1;
			
			System.out.println(object1.hashCode());
			
			System.out.println(object2.hashCode());
			
			System.out.println(object1.Addition(3, 4));
			
			System.out.println(object2.Addition(44, 21));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
