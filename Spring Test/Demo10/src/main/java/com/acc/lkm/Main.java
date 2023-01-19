package com.acc.lkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/acc/lkm/my_springbean.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		
		System.out.println("==========================================");
		System.out.println("List: "+employee.getListProperty());
		System.out.println("Set: "+employee.getSetProperty());
		System.out.println("Map: "+employee.getMapProperty());
		System.out.println("Property: "+employee.getPropertiesProperty());
		System.out.println("==========================================");
	}

}
