package com.example.springbootdemo.service;

import java.util.List;

import com.example.springbootdemo.beans.Contact;
import com.example.springbootdemo.beans.Profile;
import com.example.springbootdemo.exceptions.ProfileIdNotFoundException;

public interface ProfileService {

	// method to save the profile object that will have name & dob
	Profile store(Profile profile);

	// method to find all the profiles
	List<Profile> fetchProfiles();

	// method to find a profile based on the primary key
	Profile fetchProfile(int id) throws ProfileIdNotFoundException;
	
	// adds contact object
	Contact addContact(Contact contact);

}