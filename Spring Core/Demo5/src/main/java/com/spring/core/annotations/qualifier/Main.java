package com.spring.core.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/annotations/qualifier/config.xml");
        Emp e = (Emp) context.getBean("e1");
        
        System.out.println(e);
      


	}

}