package com.techlabs.loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random random=new Random();
		int randomNumber=random.nextInt(100)+1;
		System.out.println("randomNumber: "+randomNumber);
		//int playerNumber=sc.nextInt();
		int i=10;
		while(i>=1) {
			int playerNumber=sc.nextInt();
			if(randomNumber==playerNumber) {
				System.out.println("Correct You Win");
				break;
			}
			else if(randomNumber>playerNumber) {
				System.out.println("Your number is low. Guess again");
			}
			else if(randomNumber<playerNumber) {
				System.out.println("Your number is high. Guess again");
				
			}
		}
		

	}

}
