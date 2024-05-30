package com.monocept.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fileInputStream=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\10-Streams-app\\src\\com\\monocept\\Streams\\Text");

		try {
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\10-Streams-app\\src\\com\\monocept\\Streams\\Text");
			int ch;
		    int count=0;
		    int lines=0;
			while((ch=fileInputStream.read())!=-1) {
			  if((boolean)ch && (char)ch!=' ') {
			  }
				
				/*
				 * if((char)ch==' ') { count+=1; } if((char)ch=='\n') { lines+=1; }
				 * if((char)ch==
				 */				 
			}
			System.out.println(count);
			System.out.println(lines);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
