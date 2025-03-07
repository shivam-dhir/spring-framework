package com.shivam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args); 	
		
		// getBean is a method of ApplicationContext interface which is used to get the bean of the class 
		Temp temp = context.getBean(Temp.class);
		temp.doSomething(); 	 
	}

}
