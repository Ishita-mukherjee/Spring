package com.acc.lkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/acc/lkm/config.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		employee.display();
		
	}

}
