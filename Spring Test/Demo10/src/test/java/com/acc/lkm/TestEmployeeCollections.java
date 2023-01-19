package com.acc.lkm;

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

public class TestEmployeeCollections {
	@Autowired
	private Employee employee;

	
	@Test
	public void testValidMapNotNull(){
		assertNotNull(employee.getMapProperty());
	}
	
	@Test
	public void testValidMapSize(){
		assertTrue(employee.getMapProperty().size()>0);
	}
	
	@Test
	public void testValidMapKey(){
		assertTrue(employee.getMapProperty().containsKey("Key1"));

	}
	
	@Test
	public void testValidMapValue(){
		assertTrue(employee.getMapProperty().containsValue("1"));

	}
	
	@Test
	public void testValidListNotNull(){
		assertNotNull(employee.getListProperty());
	}
	
	@Test
	public void testValidListSize(){
		assertTrue(employee.getListProperty().size()>0);
	}
	
	@Test
	public void testValidListContent(){
		assertTrue(employee.getListProperty().contains(333));
	}
	
	@Test
	public void testValidSetNotNull(){
		assertNotNull(employee.getSetProperty());
	}
	
	@Test
	public void testValidSetSize(){
		assertTrue(employee.getSetProperty().size()>0);
	}
	
	@Test
	public void testValidSetContent(){
		assertTrue(employee.getSetProperty().contains(212));
	}

}
