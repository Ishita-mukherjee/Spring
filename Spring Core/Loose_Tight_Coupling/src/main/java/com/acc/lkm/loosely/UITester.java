package com.acc.lkm.loosely;

public class UITester {

	public static void main(String[] args) {
		Address address = new Address();
		Employee employee = new Employee(address);
		Address address1 = new Address();
		Employee employee2 = new Employee(address1);
		employee2.display();
	}

}
