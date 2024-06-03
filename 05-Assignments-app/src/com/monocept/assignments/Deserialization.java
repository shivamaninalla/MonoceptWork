package com.monocept.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SavingsAccount savingsAccount=null;
		try {
			
		    FileInputStream fileInput=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\05-Assignments-app\\src\\com\\monocept\\assignments\\SerializationFile");
		    ObjectInputStream in =new ObjectInputStream(fileInput);
		    savingsAccount=(SavingsAccount)in.readObject();
		    in.close();
		    fileInput.close();
		    
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		    System.out.println("Desirializing SavingsAccount");
		    System.out.println("Account Number: "+savingsAccount.getAccountNumber());
		    System.out.println("Account name: "+savingsAccount.getName());
		    System.out.println("Account balance: "+savingsAccount.getBalance());
		    }
	}

}
