package com.example.springbootdemo.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.beans.Contact;
import com.example.springbootdemo.beans.Profile;
import com.example.springbootdemo.exceptions.ProfileIdNotFoundException;
import com.example.springbootdemo.service.ProfileService;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
	
	// inject Service in the controller
	@Autowired
	private ProfileService profileService;
	
	@GetMapping(path = "/test")
	public ResponseEntity<Object> test() {
		return ResponseEntity.status(200).body("Hello REST");
	}
	
	// method that accepts the profileId with Contact name & phone
	@PostMapping(path = "/{id}/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> storeContact(@RequestBody Contact contact, @PathVariable("id") int id) {
		contact.setPid(id);
		Contact c = profileService.addContact(contact);
		// pass the saved entity in the response body so that client can see the saved object
		return ResponseEntity.status(200).body(c);
	}
	
	// this method must call fetchProfile(int) of ProfileService
	@GetMapping(path = "/{id}")
	public ResponseEntity<Object> fetchProfile(@PathVariable("id") int id) {
		try {
			Profile p = profileService.fetchProfile(id);
			return ResponseEntity.status(200).body(p);
		} catch (ProfileIdNotFoundException e) {
			Map<String, String> error = new LinkedHashMap<>();
			error.put("error", e.getMessage());
			error.put("errorCode", "404");
			return ResponseEntity.status(404).body(error);
		}
	}
	// this method must call store(Profile)
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> store(@RequestBody Profile profile) {
		Profile p = profileService.store(profile);
		// pass the saved entity in the response body so that client can see the saved object
		return ResponseEntity.status(200).body(p);
	}
	@GetMapping
	public ResponseEntity<Object> fetchProfiles() {
		List<Profile> list = profileService.fetchProfiles();
		return ResponseEntity.status(200).body(list);
	}
	
}
