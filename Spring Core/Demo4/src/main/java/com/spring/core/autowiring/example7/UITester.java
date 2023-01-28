package com.spring.core.autowiring.example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UITester {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/core/autowiring/example7/my_springbean.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		employee.display();
	}
}
