package com.spring.core.constructor_injection.multiple_bean;

public class Contact {
	private int id;
	private String email;
	private String phoneNumber;
	public Contact(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	public Contact(int id, String email, String phoneNumber) {
		super();
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}



	@Override
	public String toString() {
		return "Contact [id=" + id + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

}
