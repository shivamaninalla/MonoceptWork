package com.monocept.model;

import java.util.Random;
import java.util.Scanner;

public class PIGObject {
	static int score = 0;
    static int final_score = 0;
    static int turns = 1;
    static int randomNumber = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        while(final_score<20) {
        	System.out.println("Enter roll/head");
            char turn = scanner.next().charAt(0);
            if(turn=='r')
            roll();
            if(turn=='h')
            hold();
            }
        System.out.println("You won");
        System.out.println("No.of turns : " + (turns-1));
       }

	private static void hold() {
		final_score += score;
        score = 0;
        System.out.println("final score : " + final_score);
        System.out.println("Turn " + turns);
        
        turns += 1;
        }
	private static void roll() {
		Random random = new Random();
		randomNumber = random.nextInt(6) + 1;
		if (randomNumber == 1) {
			score=0;
            System.out.println("score is 0");
            turns += 1;
            return;
           } 
		System.out.println("Turn " + turns);
        System.out.println("Die " + randomNumber);
        score+=randomNumber;
        System.out.println("score: " + score);
			
            
	}
}
