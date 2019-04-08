package com.example.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class ClouldProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(ClouldProject2Application.class, args);
	}

}
