package com.example.springbootdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.beans.Profile;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
	
	@GetMapping(path = "/test")
	public ResponseEntity<Object> test() {
		return ResponseEntity.status(200).body("Hello REST");
	}
	
	@GetMapping(path = "/{id}/{name}")
	public ResponseEntity<Object> fetchProfile(@PathVariable("id") int id, 
				@PathVariable("name") String name) {
		String data = "Hello "+name+", the id is: "+id;
		return ResponseEntity.status(200).body(data);
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> store(@RequestBody Profile profile) {
		profile.setProfileId(Double.valueOf(Math.random() * 39393).intValue());
		return ResponseEntity.status(200).body(profile);
	}
}
