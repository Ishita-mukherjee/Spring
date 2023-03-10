package com.spring.core.lazy_java_config_file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.lazy_java_config_file.MyConfiguration2;

public class UITester2 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(MyConfiguration2.class);
		
		Employee employee = (Employee) applicationContext.getBean("createEmployee");
		employee.display();
	}

}
//Both employee and  address instance will get created
// as we are trying to get access to createEmployee bean