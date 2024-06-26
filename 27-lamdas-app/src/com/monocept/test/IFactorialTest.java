package com.monocept.test;

import com.monocept.model.IFactorial;

public class IFactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IFactorial iFactorial=(int a)-> {
//
//		
//				int prod=1;
//				while(a!=0) {
//					prod=prod*a;
//					a--;
//				}
//				return prod;
//			
//			
//		};
		
		
		System.out.println(fun((int a)->{
			int prod=1;
			while(a!=0) {
				prod=prod*a;
				a--;
			}
			return prod;
		}));

		


}

	private static int  fun(IFactorial iFactorial) {
		
		return iFactorial.fact(5);
	}
}