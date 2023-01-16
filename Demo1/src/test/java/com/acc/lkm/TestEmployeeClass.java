package com.acc.lkm;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.lkm.Employee;

public class TestEmployeeClass {
	
	@Test
	public void testEmployee(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/acc/lkm/config.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		Assert.assertTrue(employee!=null);
	}
	
	@Test
	public void testEmployeeSalary(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/acc/lkm/config.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		Assert.assertTrue(employee.getSalary()==200000);
	}
}
