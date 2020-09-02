package com.spring.s3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class S3Application {

	public static void main(String[] args) {
		SpringApplication.run(S3Application.class, args);
	}

}
