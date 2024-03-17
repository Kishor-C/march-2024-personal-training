package com.examples;

// some developer creates factory pattern
public class DBFactory {
	private static int counter = 0;
	private static DBOperations db = null;
	// a method that creates & returns object
	public static DBOperations getInstance() {
		// using counter to identify how many objects
		if(counter == 0) {
			db = new Two();
			counter++;
			return db;
		} else {
			return db;
		}
		
	}
}
