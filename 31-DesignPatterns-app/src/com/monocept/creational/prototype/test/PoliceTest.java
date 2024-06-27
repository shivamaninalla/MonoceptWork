package com.monocept.creational.prototype.test;

import com.monocept.creational.prototype.model.Police;

public class PoliceTest {

	public static void main(String[] args) {
		
		Police police1=new Police("Shivamani", 987654321, "DSP");
		System.out.println(police1);
		System.out.println(police1.hashCode());
		
		Police police2=(Police)police1.getClone();
		police2.setName("SwapnilSir");
		police2.setMobileNumber(123456789);
		police2.setDesignation("CI");
		
		System.out.println(police2);
		System.out.println(police2.hashCode());

	}

}
