package com.acc.lkm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acc.lkm.Address;
import com.acc.lkm.Employee;

@Configuration
public class config {
	
	@Bean
	public Employee createEmployee(Address address){
		Employee  employee = new Employee(address);
		return  employee;
	}

	@Bean(name="address")
	public Address createAddress(){
		return new Address();
	}
}
