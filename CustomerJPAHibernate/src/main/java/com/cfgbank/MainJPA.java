package com.cfgbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainJPA {

	public static void main(String[] args) {
		SpringApplication.run(MainJPA.class, args);
		System.out.println("Main JPA with Hibernate started");

	}

}
