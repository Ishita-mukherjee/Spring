package com.acc.lkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.acc.lkm.config;

public class Main {
	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(config.class); 
		Employee employee = (Employee)ctx.getBean("employee");
		System.out.println(employee);
		
		
		System.out.println("\n\n****Printing Details******");
		employee.display();
		
		
	}
}

