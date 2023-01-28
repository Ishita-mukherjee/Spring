package com.spring.core.lifecycle.Demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/lifecycle/Demo3/config.xml");
        Person p = (Person) context.getBean("p1");
        
        System.out.println(p);
        context.registerShutdownHook();
      


	}

}
