package com.acc.lkm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acc.lkm.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/com/acc/lkm/config.xml")
public class TestEmployeeClass {
	
	@Autowired
	private Employee employee;
	
	@Test
	public void testEmployee(){
		Assert.assertTrue(employee!=null);
	}
	
	@DirtiesContext(methodMode=MethodMode.AFTER_METHOD)
	@Test
	public void testEmployeeSalary(){
		System.out.println("********** test employee salary **********");
		Assert.assertFalse(employee.getSalary()!=200000);
		
	}
	
	@DirtiesContext(methodMode=MethodMode.BEFORE_METHOD)
	@Test
	public void testEmployeeName(){
		System.out.println("********** test employee Name **********");
		Assert.assertTrue(employee.getEmployeeName().equals("Jack"));
	}
}
