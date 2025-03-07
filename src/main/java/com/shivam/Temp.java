package com.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Component annotation means spring has to provide object of this class/interface etc.
@Component
public class Temp {
	
	// Autowired automatically searches all components and provides an object of required component
	@Autowired
	Laptop lap;

	public void doSomething() {
		lap.compile();
	}
	
}
