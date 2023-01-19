package com.acc.lkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(config.class);
        Employee employee =  applicationContext.getBean("createEmployee",Employee.class);
		employee.display();
		
	}

}
