package com.spring.core.Demo1.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Demo1.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/Demo1/collections/config_emp.xml");
        Emp e1 = (Emp) context.getBean("emp1");
        
        System.out.println(e1.getName());
        System.out.println(e1.getAddresses());
        System.out.println(e1.getPhones());
        System.out.println(e1.getCourses());


	}

}
