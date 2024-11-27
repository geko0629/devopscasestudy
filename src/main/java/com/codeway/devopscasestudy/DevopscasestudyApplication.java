package com.codeway.devopscasestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class DevopscasestudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopscasestudyApplication.class, args);
	}

	@EventListener
	public void logProperties(ApplicationReadyEvent event) {
		ConfigurableEnvironment env = event.getApplicationContext().getEnvironment();
		System.out.println("spring.datasource.url: " + env.getProperty("spring.datasource.url"));
	}

}
