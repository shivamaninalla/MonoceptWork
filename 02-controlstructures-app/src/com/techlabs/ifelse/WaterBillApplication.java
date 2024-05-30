package com.techlabs.ifelse;

import java.util.Scanner;

public class WaterBillApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Units Consumed: ");
		int unitsConsumed = sc.nextInt();
		int Meter_charge=75;
		int charge;
		int totalWaterBill;
		if(unitsConsumed<=100) {
	         charge=unitsConsumed*5;
		}
		else if(unitsConsumed<=250){
			 charge=unitsConsumed*10;
		}
		else{
			 charge=unitsConsumed*20;
		}
		
		
		totalWaterBill=charge+Meter_charge;
		
		System.out.println("TotalWaterBill: "+totalWaterBill);

	}

}
