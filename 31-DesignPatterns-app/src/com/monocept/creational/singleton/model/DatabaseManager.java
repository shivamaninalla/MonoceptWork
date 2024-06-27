package com.monocept.creational.singleton.model;

public class DatabaseManager {
	
	private static DatabaseManager databaseManager;
	
	private DatabaseManager() {
		
	}
	
	public static DatabaseManager getDatabaseManager() {
		if(databaseManager==null) {
			return databaseManager=new DatabaseManager();
		}
		return databaseManager;
	}
	public String getMessage() {
		return "Hi manager";
	}
}
