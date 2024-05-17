package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitPracticeApplication.class, args);

		System.out.println("master: line1 added");

		System.out.println("master: line2 added");
		
		System.out.println("feature: line1 added");
		
		System.out.println("feature: line2 added");
		
	}

	void featureMethod() {
	
	}
    public void masterMethod(){
    }
	public void sampleMethodAdded() {
		System.out.println("master: line1 added");

		System.out.println("master: line2 added");
		
		System.out.println("feature: line1 added");
		
		System.out.println("feature: line2 added");
		System.out.println("master: line1 added");

		System.out.println("master: line2 added");
		
		System.out.println("feature: line1 added");
		
		System.out.println("feature: line2 added");
		System.out.println("master: line1 added");

		System.out.println("master: line2 added");
		
		System.out.println("feature: line1 added");
		
		System.out.println("feature: line2 added");
		
		System.out.println("feature: line added");
		
		System.out.println("Feature2: line added");
		
		System.out.println("Feature3: line added");
	}

}
