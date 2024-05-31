package com.monocept.ifelse;

import java.util.Scanner;

public class SwitchCaseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		char grade=scanner.next().charAt(0);
		switch(grade) {
		case 'a':System.out.println("excellent");
		break;
		case 'b':System.out.println("verygood");
		break;
		}

	}

}
