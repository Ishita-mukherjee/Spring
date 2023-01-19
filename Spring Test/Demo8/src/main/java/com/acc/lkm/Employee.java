package com.acc.lkm;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named
//@Singleton
public class Employee {

	private Address address;
	
	@Value("1234")
	private Integer employeeId;
	
	@Value("8989") 
	private Double salary;
	
	@Inject
	public Employee(Address address){
		this.address=address;
		System.out.println("FRom Employee Const");
	}
	
	@Value("Jack")
	private String employeeName;
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("From Setter of Employee Address..");
		this.address = address;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void display() {
		System.out.println("\nEmployee Details are:");
		System.out.println("Employee ID:" + this.employeeId);
		System.out.println("Employee Salaray:" + this.salary);
		System.out.println("\nAddress line1:" + this.address.getAddressLine1());
		System.out.println("Address line2:" + this.address.getAddressLine2());
	}

	
	
}