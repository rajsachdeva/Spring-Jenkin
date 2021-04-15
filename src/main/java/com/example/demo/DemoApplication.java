package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@PostConstruct
	public void intt() {
		System.out.println("Application strted");
	}
	
	public static void main(String[] args) {
		System.out.println("Application executed");
		SpringApplication.run(DemoApplication.class, args);
	}

}
