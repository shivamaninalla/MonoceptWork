package com.monocept.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NameTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		System.out.println("Enter Names: ");
		
		try {
			BufferedWriter bufferWriter=new BufferedWriter(new FileWriter("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\28-streams-app\\src\\com\\monocept\\model\\Names"));
			String input;
			while(!(input=scanner.next()).equalsIgnoreCase("1")) {
				bufferWriter.write(input+" ");
				//bufferWriter.newLine();
				bufferWriter.flush();
				 System.out.println("Enter 1 to exit");
			}
			System.out.println("Writing completed");
			System.out.println("\n");
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		
	try {
		//FileInputStream fileInputStream=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\28-streams-app\\src\\com\\monocept\\model\\Names");
		BufferedReader bufferReader=new BufferedReader(new FileReader("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\28-streams-app\\src\\com\\monocept\\model\\Names"));
		String names;
		try {
			while((names=bufferReader.readLine())!=null) {
				String[] name=names.split("\\s+");
				for(String namee:name) {
					list.add(namee);
				}
			}
			
			System.out.println("Names yo have written: "+list);
			System.out.println("\n");
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Names that start with A: ");
	List<String> startsWithA=list.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
	startsWithA.forEach((x)->System.out.println(x));
	System.out.println("\n");
	
	System.out.println("Names after converting into UpperCase");
	List<String> upperCaseList=list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
	upperCaseList.forEach((x)->System.out.println(x));
	System.out.println("\n");
	
	System.out.println("Names after sorting Alphabetically");
	List<String> sortedList=list.stream().sorted().collect(Collectors.toList());
	sortedList.forEach((x)->System.out.println(x));
	System.out.println("\n");
	
	System.out.println("List after removal of Duplicates");
	List<String> uniqueList=list.stream().distinct().collect(Collectors.toList());
	uniqueList.forEach((x)->System.out.println(x));
	System.out.println("\n");
	
	System.out.println("New List");
	List<String> newList=list.stream().collect(Collectors.toList());
	newList.forEach((x)->System.out.println(x));
	System.out.println("\n");
	
	System.out.print("Total count of names that doesn't contains 'i': ");
	long countNames=list.stream().filter(x->!x.contains("i")).count();
	System.out.println(countNames);
	System.out.println("\n");
	
	System.out.println("Concatednated String: ");
	String concat=list.stream().collect(Collectors.joining(", "));
	System.out.println("Concatenated String: "+concat);
	System.out.println("\n");
	
	
	System.out.println("Filter applied");
	List<String> updatedList=list.stream().filter(x->x.startsWith("j")).map(x->x.toUpperCase()).sorted().collect(Collectors.toList());
	updatedList.forEach((x)->System.out.println(x));
	System.out.println("\n");
	
	
	
	

	}

}
