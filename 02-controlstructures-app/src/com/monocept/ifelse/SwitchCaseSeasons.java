package com.monocept.ifelse;

import java.util.Scanner;

public class SwitchCaseSeasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Month number");
		int month=scanner.nextInt();
		switch(month) {
		case 12:
		case 1: 
		case 2:System.out.println("Winter");
		break;
		case 3:
		case 4:
		case 5:System.out.println("Summer");
		break;
		case 6:
		case 7:
		case 8:
		case 9:System.out.println("Monsooon");
		break;
		case 10:
		case 11:System.out.println("Autumn");
		break;
		default:System.out.println("Please Enter Valid Number");
		}

	}

}
