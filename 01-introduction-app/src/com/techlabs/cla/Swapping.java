package com.techlabs.cla;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After Swapping n1 is "+n1+" n2 is "+n2);
        		
	}

}
