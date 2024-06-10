package com.monocept.test;

import com.monocept.exceptions.AgeInvalidException;
import com.monocept.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter voter=new Voter(25,"Shiva");
		
		Voter voter1=new Voter(15,"Mani");
		try {
			//voter.vote();
			voter1.vote();
		}
		catch(AgeInvalidException e){
			System.out.println(e.getMessage());
		}
		

	}

}
