package com.spring.core.Lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UITester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com/spring/core/Lazy/my_springbean.xml");
		
	}

}
