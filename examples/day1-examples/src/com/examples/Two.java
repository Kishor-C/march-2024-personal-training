package com.examples;

public class Two implements DBOperations {

	public Two() {
		System.out.println("Two() created");
	}
	
	@Override
	public void store() {
		System.out.println("store() in second implementation");
	}

	@Override
	public void delete() {
		System.out.println("delete() in second implementation");
	}

}
