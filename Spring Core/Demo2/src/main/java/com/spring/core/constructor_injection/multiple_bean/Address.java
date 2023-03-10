package com.spring.core.constructor_injection.multiple_bean;

public class Address {

	private String addressLine1;
	private String addressLine2;

	public Address() {
		System.out.println("From the constructor of Address class\n");
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		System.out.println("From: Setter of Address Line1\n");
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {

		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		System.out.println("From: Setter of Address Line2\n");
		this.addressLine2 = addressLine2;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + "]";
	}

}
