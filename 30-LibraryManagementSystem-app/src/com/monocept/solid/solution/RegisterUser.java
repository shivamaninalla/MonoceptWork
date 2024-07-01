package com.monocept.solid.solution;

import java.util.ArrayList;

import com.monocept.solid.violation.User;

public class RegisterUser implements IRegister{
	
	
	
	private ArrayList<UserSolution> userSolution;
	
	
//	public RegisterUser() {
//		super();
//	}
    
    public ArrayList<UserSolution> getUsers(){
    	return userSolution;
    }
    
    public RegisterUser() {
		this.userSolution = new ArrayList<>();
	}




	public RegisterUser(ArrayList<UserSolution> userSolution) {
	//	super();
	    this.userSolution = userSolution;
		
	}

	




    @Override
	public void registerUser(UserSolution user) {
		userSolution.add(user);
	    System.out.println("registartion completed");
		for(UserSolution l:userSolution) {
			System.out.println(l);
		}
	}

	@Override
	public String toString() {
		return "RegisterUser [userSolution=" + userSolution + "]";
	}

}
