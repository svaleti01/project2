package com.openshift.project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Project2Application {

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}
	
	@RequestMapping(value="")
	public String getGreeting() {
		return ("Hello Openshift!! Here I come, Welcome Me!!)");
	}

}
