package com.darrelasandbox._crud_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// CommandLineRunner is from Spring Boot Framework
	// Executed after Spring Beans have been loaded
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		// Java Lambda expression
		return runner -> {
			System.out.println("Hello World");
		};
	}
}
