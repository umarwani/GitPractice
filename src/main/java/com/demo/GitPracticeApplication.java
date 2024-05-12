package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitPracticeApplication.class, args);
		
		System.out.println("feature: line1 added");
		
		System.out.println("feature: line2 added");
		
	}

}
