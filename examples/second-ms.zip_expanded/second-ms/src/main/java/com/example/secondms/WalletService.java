package com.example.secondms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WalletService {

	@Autowired
	private RestTemplate template;
	
	public Wallet findWallet(long accountNumber) {
		String URL = "http://FIRST-MS/api/account/"+accountNumber;
		// Sends GET request & Load Balancer determines the physical address
		Account account = template.getForObject(URL, Account.class);
		Wallet wallet = new Wallet("MyPay", account, 1000, (account.getBalance() + 1000));
		return wallet;
	}
}
