package com.monocept.assignments;

import java.util.Random;
import java.util.Scanner;

public class PracticePigGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = 20;
        int score = 0;
        int final_score = 0;
        int turns = 1;
        int i;
        for(i=0;;i++) {
        	System.out.println("Enter r/h");
            char turn = scanner.next().charAt(0);
            if(turn=='r') {
            	checkR(random,score,turns);
            }
            else if (turn == 'h') {
            	checkH(turns, score, final_score);
            }
        }
    }



	private int score;
	private int turns;
    
    public PracticePigGame(int score,int turns) {
    	this.score=score;
    	this.turns=turns;
    }

	private static void checkH(int turns,int score,int final_score) {
		
             turns += 1;
             final_score += score;
             score = 0;
             System.out.println("final score : " + final_score);
             
             if (final_score > 20) {
                 System.out.println("You won");
                 System.out.println("No.of turns : " + turns);
                 
             }
         }
		
	

	private static PracticePigGame checkR(Random random,int score,int turns) {
		int d = 1;
        d++;
        int randomNumber;
        randomNumber = random.nextInt(6) + 1;
        System.out.println("DieScore " + randomNumber);
        if (randomNumber == 1) {
            score = 0;
            turns += 1;
        } 
        else {
            score += randomNumber;
            System.out.println("score: " + score);
        }
		
        return new PracticePigGame(score,turns);
	}
}
