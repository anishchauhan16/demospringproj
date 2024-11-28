package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoApplication {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello world";
	}
	

	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(DemoApplication.class, args);
	}

}
