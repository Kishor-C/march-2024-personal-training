package com.example.springbootdemo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.beans.Contact;
import com.example.springbootdemo.beans.Profile;
import com.example.springbootdemo.dao.ContactRepository;
import com.example.springbootdemo.dao.ProfileRepository;
import com.example.springbootdemo.exceptions.ProfileIdNotFoundException;

@Service
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	private ProfileRepository profileRepo;
	
	@Autowired
	private ContactRepository contactRepo;
	// method to save the profile object that will have name & dob
	@Override
	public Profile store(Profile profile) {
		// save method saves the entity and returns the saved entity
		return profileRepo.save(profile);
	}
	// method to find all the profiles
	@Override
	public List<Profile> fetchProfiles() {
		return profileRepo.findAll();
	}
	// method to find a profile based on the primary key
	@Override
	public Profile fetchProfile(int id) throws ProfileIdNotFoundException {
		Optional<Profile> profileOp = profileRepo.findById(id);
		return profileOp.orElseThrow(() -> new ProfileIdNotFoundException("Sorry id not found: "+id));
	}
	@Override
	public Contact addContact(Contact contact) {
		// contact with name, phone and profileId will be passed to the save
		return contactRepo.save(contact);
	}	
}
