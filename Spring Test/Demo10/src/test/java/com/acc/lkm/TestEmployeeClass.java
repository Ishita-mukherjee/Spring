package com.acc.lkm;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acc.lkm.Employee;

//Write valid annotations
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/com/acc/lkm/my_springbean.xml")


public class TestEmployeeClass {
	@Autowired
	private Employee employee;
	
	@Test
	public void testEmployee(){
		assertTrue(employee!=null);
	}
	
	@Test
	public void testEmployeeSalary(){
		assertTrue(employee.getSalary()==200000);
	}
	
	@Test
	public void testEmployeeName(){
		assertEquals(employee.getEmployeeName(),"Jack");
	}

	@Test
	public void testSalaryInValid(){
		assertNotNull(employee.getSalary());
	}
	
	@Test
	public void testEmployeeNameInValid(){
		assertNotNull(employee.getEmployeeName());
	}
	
	
}