package com.learningSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(LearningSpringApplication.class, args);
		
		Dev obj = con.getBean(Dev.class);
		obj.run();
	}

}
