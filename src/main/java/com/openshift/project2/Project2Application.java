package com.openshift.project2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Project2Application {
	
	@Value("${SERVICE_URL}")
    private String SERVICE_URL;

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}
	
	@RequestMapping(value="")
	public String getGreeting() {
		final String url = SERVICE_URL + "/getgreeting";
		RestTemplate restTemplate = new RestTemplate();
		
		String resp = restTemplate.getForObject(url, String.class);
		return (resp +  " Openshift!! Here I come, Welcome Me!! Thank you!)");
	}

}
