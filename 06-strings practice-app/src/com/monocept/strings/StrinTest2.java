package com.monocept.strings;

public class StrinTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName=new String("Shiva");
		StringBuilder middleName=new StringBuilder("Mani");
		StringBuffer lastName=new StringBuffer("Nalla");
		
		concat1(firstName);
		System.out.println(firstName);
		concat2(middleName);
		System.out.println(middleName);
		concat3(lastName);
		System.out.println(lastName);

	}

	private static void concat3(StringBuffer lastName) {
		// TODO Auto-generated method stub
		lastName=lastName.append("Shiva Mani");
		
	}

	private static void concat2(StringBuilder middleName) {
		// TODO Auto-generated method stub
		middleName=middleName.append("Shiva Nalla");
		
	}

	private static void concat1(String firstName) {
		// TODO Auto-generated method stub
		firstName=firstName+"Mani Nalla";
	}

}
