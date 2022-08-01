package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"mycontroller"})
public class AnoudwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnoudwebApplication.class, args);
	}

}
