package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class VirtualAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualAcademyApplication.class, args);
	}

}
