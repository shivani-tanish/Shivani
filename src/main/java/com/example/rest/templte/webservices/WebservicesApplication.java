package com.example.rest.templte.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebservicesApplication.class, args);
		System.out.println("Spring boot application");
		System.out.println("This project moves moves to local repo to remote");
	}

}
