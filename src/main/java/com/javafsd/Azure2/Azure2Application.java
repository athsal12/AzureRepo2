package com.javafsd.Azure2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Azure2Application {

	public static void main(String[] args) {
		SpringApplication.run(Azure2Application.class, args);
	}
	
	@GetMapping("/azure2")
	public String getValue() {
		return "Yay!! Azure application deployed successfully";
	}

}
