package com.learningSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
	@Autowired
	@Qualifier("laptop")
	Computer comp;

	public void run() {
		comp.compile();
		System.out.println("Gnani runs the project");
	}
}
