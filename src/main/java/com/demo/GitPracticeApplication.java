package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitPracticeApplication.class, args);
		
		System.out.println("...line 1 added by master");
		
		System.out.println("..line 2 added by master");
	}
	
}
