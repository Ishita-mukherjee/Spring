package com.spring.core.lazy_java_config_file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.lazy_java_config_file.MyConfiguration2;

public class UITester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(MyConfiguration2.class);
		
	
	}

}
 
//Only address instance will get created