package com.monocept.BridgeDesignPattern.test;

import java.util.Scanner;

import com.monocept.BridgeDesignPattern.model.Circle;
import com.monocept.BridgeDesignPattern.model.GreenColour;
import com.monocept.BridgeDesignPattern.model.IColour;
import com.monocept.BridgeDesignPattern.model.RedColour;
import com.monocept.BridgeDesignPattern.model.Shape;
import com.monocept.BridgeDesignPattern.model.Square;

public class MenuDrivenTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean x = true;
		System.out.println("Hello friends welcome to Bridge Design Pattern Course");
		while (x) {
			System.out.println("1.Circle\n2.Square\n3.Exit");
			System.out.println("Enter your choice: ");
			int number = scanner.nextInt();
			switch (number) {
			case 1:
				circle();
				break;
			case 2:
				square();
				break;
			case 3:
				System.out.println("You got exit from course");
				x = false;
			}
		}

	}

	private static void square() {
		System.out.println("You choosed square");
		System.out.println("1.Red square\n2.Green square\n3.Exit");
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			redSquare(new RedColour());
			break;
		case 2:
			greenSquare(new GreenColour());
			break;
		case 3:
			System.out.println("You got exit");
			break;
		}

	}

	private static void greenSquare(IColour green) {
		Shape greenSquare = new Square(green);
		greenSquare.draw();

	}

	private static void redSquare(IColour red) {
		Shape redSquare = new Square(red);
		redSquare.draw();
	}

	private static void circle() {
		System.out.println("You choosed Circle");
		System.out.println("1.Red circle\n2.Green circle\n3.Exit");
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			redCircle(new RedColour());
			break;
		case 2:
			greenCircle(new GreenColour());
			break;
		case 3:
			System.out.println("You got exit");
			break;
		}

	}

	private static void greenCircle(IColour green) {

		Shape greenCircle = new Circle(green);
		greenCircle.draw();

	}

	private static void redCircle(IColour red) {

		Shape redCircle = new Circle(red);
		redCircle.draw();

	}

}
