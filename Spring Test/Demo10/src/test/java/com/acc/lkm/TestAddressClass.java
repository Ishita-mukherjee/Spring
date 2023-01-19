package com.acc.lkm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acc.lkm.Address;

import junit.framework.Assert;


//Write valid annotations

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/com/acc/lkm/my_springbean.xml")


public class TestAddressClass {
	@Autowired
	private Address address;
	
	@Test
	public void testAddress(){
		assertTrue(address!=null);
	}
	
	@Test
	public void testAddressLine1Valid(){
		assertEquals(address.getAddressLine1(),"HSR Layout, Sector1");
	}
	
	@Test
	public void testAddressLine2Valid(){
		assertEquals(address.getAddressLine2(),"Bangalore, Karnataka");
	}
	
	@Test
	public void testAddressLine1InValid(){
		assertNotNull(address.getAddressLine1());
	}
	
	@Test
	public void testAddressLine2InValid(){
		assertNotNull(address.getAddressLine2());
	}
}