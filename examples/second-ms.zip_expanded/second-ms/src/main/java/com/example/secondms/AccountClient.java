package com.example.secondms;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("http://FIRST-MS/api/account")
public interface AccountClient {

	@GetMapping("/{accountNumber}")
	public Account getAccount(@PathVariable long accountNumber);
}
