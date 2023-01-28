package com.spring.core.constructor_injection.multiple_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UITester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/core/constructor_injection/multiple_bean/my_springbean1.xml");
		Employee employee = (Employee) applicationContext.getBean("emp");
		System.out.println("\n\n\nOutput is :");
		System.out.println(employee);
		
		Contact contact = (Contact) applicationContext.getBean("primaryContact");
		System.out.println(contact);
	}

}
