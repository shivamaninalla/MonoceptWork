package com.monocept.assignments;

import java.util.Random;
import java.util.Scanner;

public class PracticePigGame {
	
	private static int score;
	private static int turns=1;
	private static int final_score = 0;
	private static int score_1 = 0;
	private static int score_2=0;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = 20;


        

        int i;
        for(i=0;;i++) {
        	System.out.println("Enter r/h");
            char turn = scanner.next().charAt(0);
            if(turn=='r') {
            	checkR(random,score,turns,final_score);
            }
            else if (turn == 'h') {
            	checkH(turns, score, final_score);
            }
        }
    }



	



	
    
    public PracticePigGame(int score,int turns) {
    	this.score=score;
    	this.turns=turns;
    }

	private static PracticePigGame checkH(int turns,int score,int final_score) {
		
             turns += 1;
             final_score += score;
             score = 0;
             System.out.println("final score : " + final_score);
             
             if (final_score > 20) {
                 System.out.println("You won");
                 System.out.println("No.of turns : " + turns);
                 
             }
             return new PracticePigGame(score,turns);
         }
		
	

	private static PracticePigGame checkR(Random random,int score,int turns, int final_score) {
		turns=turns;
		int d = 1;
		
        d++;
        int randomNumber;
        int total_score=final_score;
        randomNumber = random.nextInt(6) + 1;
        System.out.println("DieScore " + randomNumber);
        if (randomNumber == 1) {
        	//score-=(score_1+score_2);
        	score_1=0;
        	score_2=0;
            score = 0;
            turns += 1;
            
        } 
        else {
        	
        
        		score_1+=final_score;

        	
            score_2 += randomNumber;
            score=score_1+score_2;
            
            System.out.println("score: " + score);
      //      System.out.println("This score is added to final score because the roll is not 1.");
            if(score>20) {
            	System.out.println("You won");
            
            }
            
        }
		
        return new PracticePigGame(score,turns);
	}
}
