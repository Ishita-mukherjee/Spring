package com.spring.core.annotations.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UITester {

	public static void main(String[] args) {
		//System.setProperty("spring.profiles.active", "myProfile");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/core/annotations/profiles/my_springbean.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		employee.display();
	}

}

 