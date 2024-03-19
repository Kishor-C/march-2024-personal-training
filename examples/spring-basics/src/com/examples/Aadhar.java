package com.examples;

import org.springframework.stereotype.Component;

@Component
public class Aadhar implements Identifier {

	public Aadhar() {
		System.out.println("Aadhar() object created");
	}
	
	@Override
	public void display() {
		System.out.println("Aadhar details");
	}

}
