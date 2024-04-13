package com.example.secondms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class WalletService {

//	@Autowired
//	private RestTemplate template;
	
	@Autowired
	private AccountClient client;
	
	@CircuitBreaker(name = "findWallet1", fallbackMethod = "findWallet2")
	public Wallet findWallet(long accountNumber) {
		//String URL = "http://FIRST-MS/api/account/"+accountNumber;
		// Sends GET request & Load Balancer determines the physical address
		//Account account = template.getForObject(URL, Account.class);
		System.out.println("_______ Request is going to the Remote Service ________________-");
		Account account = client.getAccount(accountNumber);
		Wallet wallet = new Wallet("MyPay", account, 1000, (account.getBalance() + 1000));
		return wallet;
	}
	
	public Wallet findWallet2(long accountNumber, Throwable t) {
		System.out.println("_____ Fallback method is executing _____________");
		Wallet wallet = new Wallet();
		return wallet;
	}
}
