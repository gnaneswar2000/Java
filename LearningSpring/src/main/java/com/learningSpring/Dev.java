package com.learningSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
	@Autowired
	Computer comp;

	public void run() {
		comp.compile();
		System.out.println("Gnani runs the project");
	}
}
