package com.monocept.creational.singleton.model;

public class Login {
	
	private static Login login;
	
	private Login() {
		
	}
	
	public static Login getLogin() {
		if(login==null)
			login=new Login();          // lazily creating
		return login;
	}
	
	public String getMessage() {
		return "Login successfull";
	}

}
