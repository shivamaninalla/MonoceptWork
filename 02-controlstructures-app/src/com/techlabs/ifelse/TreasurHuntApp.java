package com.techlabs.ifelse;

import java.util.Scanner;

public class TreasurHuntApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Direction: ");
		String direction = sc.nextLine();

		if (direction.equals("Right") || direction.equals("anythingelse")) {
			System.out.println("Fall into a hole Game over");
		} else if (direction.equals("Left")) {
			System.out.println("Enter sw: ");
			String sw = sc.nextLine();
			if (sw.equals("Swim") || sw.equals("anythingelse")) {
				System.out.println("Attacked by trout Game over");
			} else if (sw.equals("wait")) {
				System.out.println("Enter d: ");
				String d = sc.nextLine();
				if (d.equals("Red")) {
					System.out.println("Burned by fire Game over");
				} else if (d.equals("Blue")) {
					System.out.println("Eaten by beasts Game over");
				} else if (d.equals("anythingelse")) {
					System.out.println("Game over");
				} else if (d.equals("Yellow")) {
					System.out.println("You win");
				}
			}
		}

	}

}
