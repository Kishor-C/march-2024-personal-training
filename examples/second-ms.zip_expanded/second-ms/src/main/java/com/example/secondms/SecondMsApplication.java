package com.example.secondms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class SecondMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMsApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate rest() {
		return new RestTemplate();
	}
}
