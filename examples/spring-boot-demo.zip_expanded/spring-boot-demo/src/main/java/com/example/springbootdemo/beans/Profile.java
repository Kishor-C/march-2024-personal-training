package com.example.springbootdemo.beans;

import java.time.LocalDate;

public class Profile {
	private int profileId;
	private String name;
	private LocalDate dob;
	// generate setters, getters, constructors
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(int profileId, String name, LocalDate dob) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.dob = dob;
	}
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}
