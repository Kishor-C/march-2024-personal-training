package com.examples;

public class Client {
	public static void main(String[] args) {
		// client directly creates the object
		// scenario1 - tightly coupled code
		DBOperations db = new Two();
		db.store();
		db.delete();
		// abstract object creation at the client side
		// this code will be used at many places
		System.out.println("--- Object from factory ---");
		DBOperations db2 = DBFactory.getInstance();
		db2.store();
		db2.delete();
	}
}
