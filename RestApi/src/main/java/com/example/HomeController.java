package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@GetMapping("/homepage")
public String display() {
	
	return "hey, this is your first spring app";
	
}
}
