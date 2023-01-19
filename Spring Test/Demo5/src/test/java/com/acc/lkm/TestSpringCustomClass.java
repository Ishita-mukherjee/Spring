package com.acc.lkm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acc.lkm.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/com/accenture/lkm/resources/my_springbean.xml")
@ActiveProfiles(profiles="myProfile")
public class TestSpringCustomClass {
	
	@Autowired
	private Employee employee;
	
	@Test
	public void testEmployee(){
		Assert.assertTrue(employee!=null);
	}
	
	@Test
	public void testEmployeeSalary(){
		Assert.assertTrue(employee.getSalary()==200000);
	}
}
