package com.monocept.test;

import com.monocept.model.ITester;

public class ITesterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITester iTester=new ITester() {

			@Override
			public void test() {
				System.out.println("Anonymus class test method");
				
			}

			@Override
			public void next() {
				System.out.println("Anonymus class next method");
				
			}
			
		};
		
		iTester.test();
		iTester.next();

	}

}
