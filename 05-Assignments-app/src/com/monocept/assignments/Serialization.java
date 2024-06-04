package com.monocept.assignments;
import java.io.*;

//import com.monocept.model.SavingsAccount;
public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SavingsAccount sa=new SavingsAccount();
		sa.setAccountNumber(1234);
		sa.setBalance(34);
		sa.setName("Shiva");
		
		try {
			FileOutputStream fileOut=new FileOutputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\05-Assignments-app\\src\\com\\monocept\\assignments\\SerializationFile");
			//try {
				ObjectOutputStream out=new ObjectOutputStream(fileOut);
				out.writeObject(sa);
				out.close();
				fileOut.close();
				System.out.println("Serialized data is saved");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
