package com.githubAction.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionApplication.class, args);
	}


	@GetMapping
	public  String  helloWord(){
		return "Hello World";
	}

}
