package com.monocept.strings;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="java";
//		char ch[]= {'s','t','r','i','n','g','s'};
//		String s2=new String("example");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(ch);
//		String s3=new String(ch);
//		System.out.println(s3);
		
		
		        // Using String (inefficient for multiple concatenations)
		        String str = "Hello";
		        System.out.println(str.hashCode());
		        str += " World";
		        System.out.println(str.hashCode());
		        System.out.println("String: " + str);

		        // Using StringBuffer (thread-safe)
		        StringBuffer sb = new StringBuffer("Hello");
		        System.out.println(sb.hashCode());
		        sb.append(" World");
		        System.out.println(sb.hashCode());
		        System.out.println("StringBuffer: " + sb);

		        // Using StringBuilder (not thread-safe but faster)
		        StringBuilder sbuilder = new StringBuilder("Hello");
		        sbuilder.append(" World");
		        System.out.println("StringBuilder: " + sbuilder);
		    

	}

}
