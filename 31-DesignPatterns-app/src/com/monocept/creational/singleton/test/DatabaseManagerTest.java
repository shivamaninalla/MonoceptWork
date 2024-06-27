package com.monocept.creational.singleton.test;

import com.monocept.creational.singleton.model.DatabaseManager;

public class DatabaseManagerTest {

	public static void main(String[] args) {
		
		DatabaseManager databaseManager=DatabaseManager.getDatabaseManager();
		
		System.out.println(databaseManager.getMessage());
		
		System.out.println(databaseManager.hashCode());
		
        DatabaseManager databaseManager2=DatabaseManager.getDatabaseManager();
		
		System.out.println(databaseManager2.getMessage());
		
		System.out.println(databaseManager2.hashCode());
		

	}

}
