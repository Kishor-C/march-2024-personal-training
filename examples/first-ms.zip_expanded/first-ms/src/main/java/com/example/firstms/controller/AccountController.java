package com.example.firstms.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/account")
@RestController
public class AccountController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping(path = "/{accountNumber}")
	public ResponseEntity<Object> fetchBalance(@PathVariable long accountNumber) {
		double balance = Double.valueOf((Math.random() * 1234) + accountNumber).doubleValue();
		Map<Object, Object> accountMap = new LinkedHashMap<>();
		accountMap.put("accountNumber", accountNumber);
		accountMap.put("balance", Math.ceil(balance));
		accountMap.put("port", port);
		return ResponseEntity.status(200).body(accountMap);
	}
}
