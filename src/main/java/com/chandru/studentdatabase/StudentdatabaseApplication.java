package com.chandru.studentdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.chandru"})
public class StudentdatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdatabaseApplication.class, args);
	}
}
