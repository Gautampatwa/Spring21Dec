package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudUsingJpaMastercardApplication implements CommandLineRunner {

	@Autowired
	private Employee employee;
	public static void main(String[] args) {
		SpringApplication.run(CrudUsingJpaMastercardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World Welcome to Srping Boot application");
		this.employee.studying();
	}
}
