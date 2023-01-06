package com.spring.core.autowiring.example5;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
