package com.example.secondms;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wallet")
public class WalletController {

	@Autowired
	private WalletService service;
	
	@Value("${database.username}")
	private String username;
	
	@Value("${database.password}")
	private String password;
	
	@GetMapping("/config")
	public ResponseEntity<Object> getProperties() {
		Map<String, String> configMap = new LinkedHashMap<>();
		configMap.put("username", username);
		configMap.put("password", password);
		return ResponseEntity.status(200).body(configMap);
	}
	
	@GetMapping("/{accountNumber}")
	public ResponseEntity<Object> fetchWalletDetails(@PathVariable long accountNumber) {
		Wallet wallet = service.findWallet(accountNumber);
		return ResponseEntity.status(200).body(wallet);
	}
}
