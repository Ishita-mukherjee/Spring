package com.spring.core.Demo1.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Demo1.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/Demo1/reference/config_ref.xml");
        A temp = (A) context.getBean("a");
        
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);


	}

}
