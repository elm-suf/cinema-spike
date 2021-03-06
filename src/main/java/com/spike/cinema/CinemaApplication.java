package com.spike.cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CinemaApplication {
	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}
}

@RestController
class Hello {
	@GetMapping("/")
	String hello() {
		return "try \n/cinema \n/film \n ...";
	}
}