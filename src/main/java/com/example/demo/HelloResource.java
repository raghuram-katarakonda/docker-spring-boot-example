package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/docker")
public class HelloResource {
	
	@GetMapping
	public String helloDocker() {
		
		return "Hello Docker";
	}

}
