package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import com.monocept.exceptions.CapacityFullException;
import com.monocept.exceptions.NoSuchMovieException;
import com.monocept.model.Movie;

public class MovieDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Scanner scanner=new Scanner(System.in);
		
		Movie movies[]=new Movie[5];
		int numberOfMovies=0;
		
		FileInputStream fileInput=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\22-ExceptionHandling-app\\src\\com\\monocept\\test\\MovieList");
		ObjectInputStream object=new ObjectInputStream(fileInput);
		Movie[] addedMovies=(Movie[])object.readObject();
		for(int i=0;i<addedMovies.length;i++) {
			if(addedMovies[i]!=null) {
				movies[i]=addedMovies[i];
				numberOfMovies++;
			}
		}

		
		boolean x=true;
		while(x) {
			System.out.println("Choose options \n1.Displaymovies\n2.Add movies\n3.ParticularMovie\n4.Exit");
			int number=scanner.nextInt();
			switch(number) {
			case 1: display(movies);
			break;
			case 2: try {
				    addMovieName(scanner,movies,numberOfMovies);
				    addmovieId(scanner,movies,numberOfMovies);
				    addmovieGenre(scanner,movies,numberOfMovies);
				    addmovieYear(scanner,movies,numberOfMovies);
				    numberOfMovies++;
			}
			catch(CapacityFullException e) {
				System.out.println(e.getMessage());
			}
			    
		
			break;
			case 3:try {
				displayParticularMovie(scanner,movies);
			}
			catch(NoSuchMovieException e) {
				System.out.println(e.getMessage());
			}
			break;
			case 4:System.out.println("Thank you. You got out");
			x=false;
			break;
			
			}
		}
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
				return;
			}
		}
		throw new NoSuchMovieException();
		
		
		
	}

	











	private static void addmovieYear(Scanner scanner, Movie[] movies,int k) {
		System.out.println("Enter Movie Year: ");
		int year=scanner.nextInt();
		movies[k].setYear(year);
		
	}

	private static void addmovieGenre(Scanner scanner, Movie[] movies,int k) {
		System.out.println("Enter Movie Genre: ");
		String genre=scanner.next();
		movies[k].setGenre(genre);
		
	}

	private static void addmovieId(Scanner scanner, Movie[] movies,int k) {
		System.out.println("Enter Movie ID: ");
		int movieId=scanner.nextInt();
		movies[k].setMovieId(movieId);
		
	}

	private static void addMovieName(Scanner scanner, Movie[] movies,int k) {
		if(k==5) {
			throw new CapacityFullException();
		}
		System.out.println("Enter Movie name: ");
		String name=scanner.next();
		movies[k]=new Movie();
		movies[k].setName(name);
		
	}
	
	
	

}
