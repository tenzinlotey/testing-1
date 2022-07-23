package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Demo2Application {

	@GetMapping("/")
	public String test() {
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
