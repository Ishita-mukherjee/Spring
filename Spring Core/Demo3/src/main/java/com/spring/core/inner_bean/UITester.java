package com.spring.core.inner_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UITester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/core/inner_bean/my_springbean.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		employee.display();

		 //System.out.println(applicationContext.getBean("test"));
	}

}

 
