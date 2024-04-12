package com.example.secondms;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("/{accountNumber}")
	public ResponseEntity<Object> fetchWalletDetails(@PathVariable long accountNumber) {
		Wallet wallet = service.findWallet(accountNumber);
		return ResponseEntity.status(200).body(wallet);
	}
}
