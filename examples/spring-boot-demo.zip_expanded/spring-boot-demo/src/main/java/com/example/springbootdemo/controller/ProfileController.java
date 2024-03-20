package com.example.springbootdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
	
	@GetMapping(path = "/test")
	public ResponseEntity<Object> test() {
		return ResponseEntity.status(200).body("Hello REST");
	}
}
