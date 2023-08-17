// In Java, package names are typically written in all lowercase letters.
// This convention is outlined in the Java Language Specification and is recommended by Oracle's Java Code 

package com.darrelasandbox._01_hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
