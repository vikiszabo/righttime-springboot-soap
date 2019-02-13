package com.springboot.time.springboottime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringBootTimeApplication {

	private static final Logger Logger = LogManager.getLogger(SpringBootTimeApplication.class);
	public static void main(String[] args) {
		Logger.info("Starting Spring Boot Time Application");
		SpringApplication.run(SpringBootTimeApplication.class, args);
	}

}

