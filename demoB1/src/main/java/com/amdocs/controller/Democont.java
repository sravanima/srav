package com.amdocs.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Democont {
	@GetMapping("/in")
	public String show() {
		return "Welcome to Spring Boot";
	}

}
