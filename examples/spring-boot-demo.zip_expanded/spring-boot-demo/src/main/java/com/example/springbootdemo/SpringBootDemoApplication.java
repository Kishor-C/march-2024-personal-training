package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication is the one which performs the auto-configuration based on the
 * library you have in the project
 * ex: If Web library is added, it configures the embedded server, front controller, component scanning
 * ex: If Jpa library is added, it configures the database connection by reading application.properties
 * ex: If Dev tools library is added, it configures the application to reload when code is changed
 */
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
