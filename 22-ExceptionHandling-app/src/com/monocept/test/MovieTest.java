package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.monocept.exceptions.NoSuchMovieException;
//import com.monocept.exceptions.CapacityFullException;
//import com.monocept.exceptions.NoSuchMovieException;
import com.monocept.model.Movie;

public class MovieTest {

	public static void main(String[] args) throws IOException {
		
		Movie movie[]=new Movie[5];
		
		int i=0;
		Scanner scanner=new Scanner(System.in);
		boolean x=false;
		while(!x) {
			
			System.out.println("Choose options \n1.Displaymovies\n2.Add movies\n3.ParticularMovie\n4.Exit");
			int number=scanner.nextInt();
			switch(number) {
			case 1: display(movie);
			break;
			case 2: addMovieName(scanner,movie,i);
				    addmovieId(scanner,movie,i);
				    addmovieGenre(scanner,movie,i);
				    addmovieYear(scanner,movie,i);
				    i++;

				    	
			break;
			case 3:displayParticularMovie(scanner,movie);
			break;
			case 4:System.out.println("Thank you. You got out");
			x=true;
			break;
			
			}
			
		}
		
		FileOutputStream fileOutput=new FileOutputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\22-ExceptionHandling-app\\src\\com\\monocept\\test\\MovieList");
		ObjectOutputStream object=new ObjectOutputStream(fileOutput);
		object.writeObject(movie);
		System.out.println("Object got serialized");

	}

	

	private static void display(Movie[] movie) {
		for(Movie movies:movie) {
			System.out.println(movies);
		}
		
	}

	private static void displayParticularMovie(Scanner scanner, Movie[] movie) {
		System.out.println("Enter movie id to diplay particular movie Details: ");
		int d=scanner.nextInt();
		for(int i=0;i<5;i++) {
			if(movie[i]!=null && d==movie[i].getMovieId()) {
				System.out.println(movie[i]);
				
			}
		}
	
		
	}

	
    private static void addmovieYear(Scanner scanner, Movie[] movie,int i) {
		System.out.println("Enter Movie Year: ");
		int year=scanner.nextInt();
		movie[i].setYear(year);
		
	}

	private static void addmovieGenre(Scanner scanner, Movie[] movie,int i) {
		System.out.println("Enter Movie Genre: ");
		String genre=scanner.next();
		movie[i].setGenre(genre);
		
	}

	private static void addmovieId(Scanner scanner, Movie[] movie,int i) {
		System.out.println("Enter Movie ID: ");
		int movieId=scanner.nextInt();
		movie[i].setMovieId(movieId);
		
	}

	private static void addMovieName(Scanner scanner, Movie[] movie,int i) {
		System.out.println("Enter Movie name: ");
		String name=scanner.next();
		movie[i]=new Movie();
		movie[i].setName(name);
		
	}
	

}
