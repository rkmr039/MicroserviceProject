package com.rishab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BankWebClientApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(BankWebClientApplication.class, args);
	}

}
