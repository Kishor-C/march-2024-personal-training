package com.example.springbootdemo.exceptions;

@SuppressWarnings("serial")
public class ProfileIdNotFoundException extends Exception {
	public ProfileIdNotFoundException(String err) {
		super(err);
	}
}
