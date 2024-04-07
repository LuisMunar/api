package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		// Dotenv dotenv = Dotenv.load();
		SpringApplication.run(ApiApplication.class, args);
	}
}
