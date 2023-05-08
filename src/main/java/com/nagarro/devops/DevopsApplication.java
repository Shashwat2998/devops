package com.nagarro.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {
	
	@GetMapping("/ping")
	public static String ping() {
		
		System.out.println("Hi from the controller");
		return "Hi from the controller";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
		String string= ping();
	}

}
