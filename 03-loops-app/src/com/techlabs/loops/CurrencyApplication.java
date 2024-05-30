package com.techlabs.loops;

import java.util.Scanner;

public class CurrencyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount: ");
		int a=sc.nextInt();
		int two_thousand=0;
		int five_hundred=0, two_hundred=0, one_hundred=0;
		if(a<50000 && a%100==0) {
			while(a>=100) {
				if(a>=2000) {
					two_thousand=a/2000;
					a=a-(2000*two_thousand);
					
				}
				else if(a>=500) {
					five_hundred=a/500;
					a=a-(500*five_hundred);
				}
				else if(a>=200) {
					two_hundred=a/200;
					a=a-(200*two_hundred);
				}
				else {
					one_hundred=a/100;
					a=a-(100*one_hundred);
				}
			}
		}
		else if(a<50000 && a%100!=0) {
			System.out.println("Enter amount which is multiple of hundred");
			
		}
		else {
			System.out.println("Enter valid Amount");
		}
		if(two_thousand>0) {
			System.out.println("two_thousands: "+two_thousand);
		}
		if(five_hundred>0) {
			System.out.println("five_hundreds: "+five_hundred);
		}
		if(two_hundred>0) {
			System.out.println("two_hundreds: "+two_hundred);
		}
		if(one_hundred>0) {
			System.out.println("one_hundreds: "+one_hundred);
		}
		

	}

}
