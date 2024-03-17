package com.examples;

public class ClientSingleton {
	public static void main(String[] args) {
		System.out.println("--- client one ---");
		DBOperations db1 = DBFactory.getInstance();
		db1.store();
		db1.delete();
		System.out.println("--- client two ----");
		DBOperations db2 = DBFactory.getInstance();
		db2.store();
		db2.delete();
	}
}
