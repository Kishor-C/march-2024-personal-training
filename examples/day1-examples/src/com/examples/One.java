package com.examples;

public class One implements DBOperations {

	@Override
	public void store() {
		System.out.println("store() in first implementation");
	}

	@Override
	public void delete() {
		System.out.println("delete() in first implementation");
	}

}
