package com.spike.cinema;

import com.spike.cinema.cinema.Cinema;
import com.spike.cinema.cinema.CinemaRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CinemaApplication {
	private static final Logger log = LoggerFactory.getLogger(CinemaApplication.class);

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